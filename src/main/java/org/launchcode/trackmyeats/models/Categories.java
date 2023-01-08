package org.launchcode.trackmyeats.models;

public enum Categories {
    ITALIAN("Italian"), CHINESE("Chinese"), AMERICAN("American");


    private final String displayName;

    Categories(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
