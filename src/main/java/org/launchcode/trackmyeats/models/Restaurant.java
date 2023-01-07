package org.launchcode.trackmyeats.models;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    private String restaurantName;

    private String restaurantLocation;

    private ArrayList<String> categories = new ArrayList<>();

    private Date date;

    private Float stars;

    private String review;

    public Restaurant(){}

    public Restaurant(String restaurantName, String restaurantLocation,
                      ArrayList<String> categories, Date date, Float stars, String review) {
        this();
        this.restaurantName = restaurantName;
        this.restaurantLocation = restaurantLocation;
        this.categories = categories;
        this.date = date;
        this.stars = stars;
        this.review = review;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
}
