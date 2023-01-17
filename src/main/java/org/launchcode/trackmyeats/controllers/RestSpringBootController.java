//package org.launchcode.trackmyeats.controllers;
//
//import org.launchcode.trackmyeats.models.dto.Date;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.launchcode.trackmyeats.models.dto.Date.LocalDateTimeApi;
//
//@RestController
//public class RestSpringBootController {
//
//    @RequestMapping("/hello")
//    public String hello() {
//        return "Hello world23";
//    }
//
//    @GetMapping(value = "/countries")
//    public List<Object> getCountries(){
//    String url = "https:..restcountries.eu/rest/v2/all";
//        RestTemplate restTemplate = new RestTemplate();
//
//        Object[] countries = restTemplate.getForObject(url, Object[].class);
//        return Arrays.asList(countries);
//    }
//}
