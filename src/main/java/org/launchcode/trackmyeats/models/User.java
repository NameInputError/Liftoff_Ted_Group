package org.launchcode.trackmyeats.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
public class User extends AbstractEntity {

    @NotBlank
    @NotNull
    @Size(min = 5, max = 15)
    private String username;

    @Email
    private String email;

    @NotBlank
    @NotNull
    @Size(min = 6)
    private String password;


    public User() {}

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public boolean isMatchingPassword(String password) {
        return false;
    }
}
