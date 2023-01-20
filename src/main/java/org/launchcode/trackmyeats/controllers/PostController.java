package org.launchcode.trackmyeats.controllers;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.launchcode.trackmyeats.models.Restaurant;
import org.launchcode.trackmyeats.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/search")
public class PostController {

//    @Value("${api.key}")
//    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;
    // @Autowired
    // private PostService postService;

    @RequestMapping("")
    public Restaurant getRestaurantInfo(String restaurantName) {
        RestaurantDetails restaurantDetails = restTemplate.getForObject("https://www.boredapi.com/api/activity", RestaurantDetails.class);
        return new Restaurant(restaurantName, RestaurantDetails.getRating());

//        OkHttpClient client = new OkHttpClient();
//
//        new Request.LoginFormDTO()
//                .url("https://api.yelp.com/v3/businesses/search?term=food&sort_by=best_match&limit=20")
//                .get()
//                .addHeader("accept", "application/json")
//                .build();
//        Request request;
//
//        Response response = client.newCall(request).execute();
//    public String getAllRestaurants() {
//       String response = postService.getAllRestaurants();
//       return response;

        // }

    }
}