package org.launchcode.trackmyeats.controllers;

import jakarta.validation.Valid;
import org.launchcode.trackmyeats.models.Restaurants;
import org.launchcode.trackmyeats.models.Restaurant;
import org.launchcode.trackmyeats.models.data.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("eats")
public class RestaurantController {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @GetMapping("")
    public String displayRestaurants(@RequestParam(required = false) Integer restaurantId, Model model) {
       // Restaurant restaurant = result.get();
        //model.addAttribute("title", "My Eats: " + restaurant.getRestaurantName());
        model.addAttribute("restaurants", restaurantRepository.findAll());
        return "index";
    }

    @GetMapping("add")
    public String displayAddRestaurantForm(Model model) {
        model.addAttribute("title", "Add a Restaurant");
        model.addAttribute(new Restaurant());
        model.addAttribute("types", Restaurants.values());
        return "add";
    }

//    @PostMapping("create")
//    public String processCreateEventForm(@ModelAttribute @Valid Restaurant newRestaurant,
//                                         Errors errors, Model model) {
//        if(errors.hasErrors()) {
//            model.addAttribute("title", "Add a Restaurant");
//            return "eats/add";
//        }
//
//        restaurantRepository.save(newRestaurant);
//        return "redirect:";
   // }

//    @GetMapping("delete")
//    public String displayDeleteEventForm(Model model) {
//        model.addAttribute("title", "Delete Events");
//        model.addAttribute("events", eventRepository.findAll());
//        return "events/delete";
//    }

//    @PostMapping("delete")
//    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) {
//
//        if (eventIds != null) {
//            for (int id : eventIds) {
//                eventRepository.deleteById(id);
//            }
//        }
//
//        return "redirect:";
//    }

    @GetMapping("details")
    public String displayRestaurantDetails(@RequestParam (required = false) Integer restaurantId, Model model) {

        Optional<Restaurant> result = restaurantRepository.findById(restaurantId);

        if (result.isEmpty()) {
            model.addAttribute("title", "Invalid Restaurant ID: " + restaurantId);
        } else {
            Restaurant restaurant = result.get();
            model.addAttribute("title", restaurant.getRestaurantName() + " Details");
            model.addAttribute("restaurant", restaurant);
        }

        return "eats/details";
    }



}
