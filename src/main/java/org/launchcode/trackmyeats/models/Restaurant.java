package org.launchcode.trackmyeats.models;

import jakarta.persistence.Entity;

import java.time.LocalDate;
import java.util.ArrayList;

@Entity
public class Restaurant extends AbstractEntity{

    private String restaurantName;

    private String restaurantLocation;

    private ArrayList<String> categories = new ArrayList<>();

    private LocalDate date;

    private Float stars;

    private String review;

    private Restaurants type;

    private String term;


    public Restaurant() {
    }

    public Restaurant(String restaurantName, Object rating){}

    public Restaurant(String restaurantName, String restaurantLocation,
                      ArrayList<String> categories, Float stars, String review, Restaurants type) {
        this.restaurantName = restaurantName;
        this.restaurantLocation = restaurantLocation;
        this.type = type;
        this.stars = stars;
        this.review = review;
        this.type = type;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }

    public ArrayList<String> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<String> categories) {
        this.categories = categories;
    }

    public Float getStars() {
        return stars;
    }

    public void setStars(Float stars) {
        this.stars = stars;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Restaurants getType() {
        return type;
    }

    public void setType(Restaurants type) {
        this.type = type;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
}
