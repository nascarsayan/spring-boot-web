package com.example.hunger.restaurant;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("restaurants")
public class RestaurantController {

    private final RestaurantRepository restaurantRepository;

    public RestaurantController(RestaurantRepository orderRepository) {
        this.restaurantRepository = orderRepository;
    }

    List<Restaurant> restaurants = new ArrayList<>();

    @RequestMapping("hello")
    public String showHello() {
        return "Hello from restaurant!";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createRestaurant(
        @RequestBody Restaurant restaurant
    ) {
        restaurants.add(restaurant);
        restaurantRepository.insert(restaurant);
    }

    @GetMapping
    public List<Restaurant> getRestaurants() {
        return restaurantRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Restaurant> getRestaurant(
        @PathVariable("id") Integer id
    ) {
        for (Restaurant r: restaurants) {
            if (r.id == id) {
                return Optional.of(r);
            }
        }
        return Optional.empty();
    }
}
