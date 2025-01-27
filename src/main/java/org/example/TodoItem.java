package org.example;

import java.time.LocalDate;

public class TodoItem {
    private int id;
    private String title;
    private  String description;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    //constructor
    public TodoItem(int id, String title, String description, LocalDate deadLine, boolean done, Person creator) {
        if(title ==null || title.trim().isEmpty()){
            throw new IllegalArgumentException("The title can't be empty. ");
        }
        if(deadLine ==null ){
            throw new IllegalArgumentException("The deadline can't be empty. ");
        }
        if(deadLine.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("The deadline can not be before today.");
        }
        this.id = id;
        this.title = title;
        this.description = description;
        this.deadLine = deadLine;
        this.done = done;
        this.creator = creator;
    }

    //getters

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public Person getCreator() {
        return creator;
    }

    //setters

    public void setTitle(String title) {
        if(title ==null || title.trim().isEmpty()){
            throw new IllegalArgumentException("The title can't be empty. ");
        }
        this.title = title;
    }

    public void setDescription(String description) {
        if(description ==null || description.trim().isEmpty()){
            throw new IllegalArgumentException("The description can't be empty. ");
        }
        this.description = description;
    }

    public void setDeadLine(LocalDate deadLine) {
        if(deadLine.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("The deadline can not be before today.");
        }
        this.deadLine = deadLine;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    //other methods

    public boolean isOverdue(){
        return deadLine.isBefore(LocalDate.now());
    }

    public String getSummary(){
        return "id: " + this.id + ", " + "Title: " + getTitle() + ", " + " description: " + getDescription() + ", "
                + "deadline: " + getDeadLine() + ", " + "Is the task done? " + isDone() + ", " +
                "creator: " + getCreator().getFirstName() + " " + getCreator().getLastName();
    }

}





