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
    public String displayRestaurants(@RequestParam(required = false) Integer restaurantId,Model model) {
        //Restaurant restaurant = result.get();
        //model.addAttribute("title", "My Eats: " + restaurant.getRestaurantName());
        model.addAttribute("restaurants", restaurantRepository.findAll());
        return "eats";
    }

    @GetMapping("search")
    public String displaySearchFieldAndMap(Model model) {
        model.addAttribute("title", "Where did you eat?");


        return "search";
    }

//    @PostMapping("search")
//    public String displaySearchFieldAndMap(Model model) {
//        model.addAttribute("title", "Where did you eat?");
//
//
//        return "search";
//    }


    @GetMapping("add")
    public String displayAddRestaurantForm(Model model) {
        model.addAttribute("title", "Add a Restaurant");
        model.addAttribute(new Restaurant());
        model.addAttribute("types", Restaurants.values());
        return "add";
    }

    @PostMapping("add")
    public String processAddRestaurantForm(@ModelAttribute @Valid Restaurant newRestaurant,
                                         Errors errors, Model model) {
        if(errors.hasErrors()) {
            model.addAttribute("title", "Add a Restaurant");
            return "add";
        }

        restaurantRepository.save(newRestaurant);
        return "redirect:/eats";
    }

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
