package org.launchcode.trackmyeats.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class Restaurant extends AbstractEntity{

    private String select;

    private String parkinglot;

    private String sort;

    private Float averageCost;

    private String q;

    public String getSelect() {
        return select;
    }

    public String getParkinglot() {
        return parkinglot;
    }

    public String getSort() {
        return sort;
    }

    public Float getAverageCost() {
        return averageCost;
    }

    public String getQ() {
        return q;
    }

    //    private String restaurantName;
//
//    private String restaurantLocation;
//
//    private ArrayList<String> categories = new ArrayList<>();
//
//    private LocalDate date;
//
//    private Float stars;
//
//    private String review;
//
//    private Restaurants type;
//
//
//    public Restaurant(){}
//
//    public Restaurant(String restaurantName, String restaurantLocation,
//                      ArrayList<String> categories, Float stars, String review, Restaurants type) {
//        this.restaurantName = restaurantName;
//        this.restaurantLocation = restaurantLocation;
//        this.type = type;
//        this.stars = stars;
//        this.review = review;
//        this.type = type;
//    }
//
//    public String getRestaurantName() {
//        return restaurantName;
//    }
//
//    public void setRestaurantName(String restaurantName) {
//        this.restaurantName = restaurantName;
//    }
//
//    public String getRestaurantLocation() {
//        return restaurantLocation;
//    }
//
//    public void setRestaurantLocation(String restaurantLocation) {
//        this.restaurantLocation = restaurantLocation;
//    }
//
//    public ArrayList<String> getCategories() {
//        return categories;
//    }
//
//    public void setCategories(ArrayList<String> categories) {
//        this.categories = categories;
//    }
//
//    public Float getStars() {
//        return stars;
//    }
//
//    public void setStars(Float stars) {
//        this.stars = stars;
//    }
//
//    public String getReview() {
//        return review;
//    }
//
//    public void setReview(String review) {
//        this.review = review;
//    }
//
//    public Restaurants getType() {
//        return type;
//    }
//
//    public void setType(Restaurants type) {
//        this.type = type;
//    }
//
//    public void setDate(LocalDate date) {
//        this.date = date;
//    }
//
//    public LocalDate getDate() {
//        return date;
//    }
}
