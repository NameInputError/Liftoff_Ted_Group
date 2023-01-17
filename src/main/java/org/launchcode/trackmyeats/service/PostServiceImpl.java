package org.launchcode.trackmyeats.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String getAllRestaurants() {
        String result = restTemplate.getForObject("https://docs.developer.yelp.com/reference/v3_business_search", String.class);
         System.out.println(result);

          return result;
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("https://api.yelp.com/v3/businesses/search?sort_by=best_match&limit=20"))
//                .header("accept", "application/json")
//                .method("GET", HttpRequest.BodyPublishers.noBody())
//                .build();
//        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//        System.out.println(response.body());
//
//        return response.body();
    }

}
