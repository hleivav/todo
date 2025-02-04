package org.example;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String credentials;

    //constructor
    public Person(int id, String firstName, String lastName, String email, String credentials) {
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
        this.credentials = credentials;
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

    public String getCredentials() {
        return credentials;
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

    public void setCredentials(String credentials){
        if(credentials == null || credentials.trim().isEmpty()){
            throw  new IllegalArgumentException(("The credentials can't be empty!"));
        }
        this.credentials = credentials;
    }


    //other methods
    public String getSummary(){
        return "id: " + this.id + ", " + "name: " + getFirstName() + " " + getLastName() + " email: " + getEmail();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "id: " + this.id + ", " + "name: " + getFirstName() + " " + getLastName() + " email: " + getEmail() ;
    }
}
