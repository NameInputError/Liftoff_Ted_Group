package org.launchcode.trackmyeats.controllers;

import org.launchcode.trackmyeats.models.Restaurant;
import org.launchcode.trackmyeats.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestaurantServiceController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/eats")
    public Object[] getAllRestaurantsComplete() {
        return restaurantService.findAllRestaurantsComplete();
    }

    @GetMapping
    public Restaurant[] getAllRestaurants() {
        return restaurantService.findAllRestaurants();
    }
}
