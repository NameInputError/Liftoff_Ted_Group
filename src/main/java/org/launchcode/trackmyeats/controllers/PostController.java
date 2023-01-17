package org.launchcode.trackmyeats.controllers;

import org.launchcode.trackmyeats.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("")
    public String getAllRestaurants() {
       String response = postService.getAllRestaurants();
       return response;

    }

}
