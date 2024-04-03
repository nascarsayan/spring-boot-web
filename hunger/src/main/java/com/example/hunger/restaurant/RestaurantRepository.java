package com.example.hunger.restaurant;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class RestaurantRepository {
    private final JdbcClient jdbcClient;

    public RestaurantRepository(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public Restaurant insert(Restaurant restaurant) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcClient.sql(
                "INSERT INTO restaurants(name, address, phone) VALUES (:name, :address, :phone)")
                .params(Map.of(
                        "name", restaurant.name,
                        "address", restaurant.address,
                        "phone", restaurant.phone
                ))
                .update(keyHolder);
        restaurant.id = Integer.parseInt(keyHolder.getKey().toString());
        return restaurant;
    }

    public List<Restaurant> findAll() {
        return jdbcClient.sql("SELECT * FROM restaurants")
                .query((rs, rowNum) -> new Restaurant(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("address"),
                        rs.getString("phone")
                ))
                .list();
    }
}
