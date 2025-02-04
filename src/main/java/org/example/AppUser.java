package org.example;

import java.util.Objects;

public class AppUser {
    //private fields
    private String username;
    private String password;
    private AppRole role;
    //constructor
    public AppUser(String username, String password, AppRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    //getters & setters
    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }
    //override methods


    @Override
    public String toString() {
        return "User name: " + username + " User role: " + role.name();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(username, appUser.username) && Objects.equals(password, appUser.password) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password, role);
    }
}
