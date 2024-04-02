package com.example.hunger.restaurant;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("restaurants")
public class RestaurantController {
    @RequestMapping("hello")
    public String showHello() {
        return "Hello from restaurant!";
    }
}
