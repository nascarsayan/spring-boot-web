package com.example.hunger.restaurant;

import com.example.hunger.restaurant.RestaurantRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("restaurants")
public class RestaurantUiController {
  private final RestaurantRepository restaurantRepository;

  public RestaurantUiController(RestaurantRepository orderRepository) {
    this.restaurantRepository = orderRepository;
  }

  @GetMapping
  public String getRestaurants(Model model) {
    var restaurantList = restaurantRepository.findAll();
    model.addAttribute("restaurants", restaurantList);
    return "restaurants";
  }
}
