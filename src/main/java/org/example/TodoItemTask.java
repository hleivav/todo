package org.example;

public class TodoItemTask {

    private int id;
    private boolean assigned;
    private String todoItem;
    private Person assignee;

    //constructor
    public TodoItemTask(int id, String todoItem, Person assignee){
        if (getAssignee() != null) this.assigned = true;
        if (todoItem == null || todoItem.trim().isEmpty()){
            throw new IllegalArgumentException("A todo item must be entered. ");
        }
        this.id = id;
        this.todoItem = todoItem;
        this.assignee = assignee;
    }

    //getters
    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public String getTodoItem() {
        return todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    //setters
    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public void setTodoItem(String todoItem) {
        if (todoItem == null || todoItem.trim().isEmpty()){
            throw new IllegalArgumentException("A todo item must be entered. ");
        }
        this.todoItem = todoItem;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

        //other methods
   public String getSummary(){
       return "Id: " + this.id + ", " + " is assigned: " + isAssigned() + ", " + "assignee: " +
               getAssignee().getFirstName() + " " + getAssignee().getLastName();
   }
}
