package org.example;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    //constructor
    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
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
        try {
            if ( firstName != null && !firstName.trim().isEmpty()){
                this.firstName = firstName;
            } else {
                System.out.println(" Your input is empty. ");
            }
        } catch ( Exception e) {
            System.out.println("There 's a problem" + e.getMessage());
        }
    }

    public void setLastName(String lastName) {
        try {
            if ( lastName != null && !lastName.trim().isEmpty()){
                this.lastName = lastName;
            } else {
                System.out.println(" Your input is empty. ");
            }
        } catch ( Exception e) {
            System.out.println("There 's a problem" + e.getMessage());
        }

    }

    public void setEmail(String email) {
        try {
            if ( email != null && !email.trim().isEmpty()){
                this.email = email;
            } else {
                System.out.println(" Your input is empty. ");
            }
        } catch ( Exception e) {
            System.out.println("There 's a problem" + e.getMessage());
        }
    }
}
