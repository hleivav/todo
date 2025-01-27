package org.example;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    //constructor
    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        if(firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("The firstname can't be empty!");
        }
        if(lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("The lastname can't be empty!");
        }
        if(email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("The email can't be empty!");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    //getters

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    //setters


    public void setFirstName(String firstName) {
        if(firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("The lastname can't be empty!");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("The lastname can't be empty!");
        }
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        if(email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("The lastname can't be empty!");
        }
        this.email = email;
    }

    public String getSummary(){
        return "id: " + this.id + ", " + "name: " + getFirstName() + " " + getLastName() + " email: " + getEmail();
    }
}
