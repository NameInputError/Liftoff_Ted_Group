package org.launchcode.trackmyeats.service;

import org.launchcode.trackmyeats.models.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestaurantService {

    @Autowired
    private RestTemplate template = new RestTemplate();

    public Object[] findAllRestaurantsComplete() {
        return template.getForObject("", Object[].class);
    }

    public Restaurant[] findAllRestaurants(){
        return template.getForObject("", Restaurant[].class);
    }

}
