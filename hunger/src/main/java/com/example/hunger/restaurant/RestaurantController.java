package com.example.hunger.restaurant;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("restaurants")
public class RestaurantController {

    List<Restaurant> restaurants = new ArrayList<>();

    @RequestMapping("hello")
    public String showHello() {
        return "Hello from restaurant!";
    }

    @PostMapping
    public String createRestaurant(
        @RequestBody Restaurant restaurant
    ) {
        return restaurant.name;
    }
}
