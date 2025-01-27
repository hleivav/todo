package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(1, "Hernan", "Leiva", "hleiva@hotmail.com");
        Person person2 = new Person(2, "Sebastian", "Leiva", "sebleiva@hotmail.com");
        System.out.println(person1.getSummary());
        System.out.println(person2.getSummary());
        TodoItem todoItem1 = new TodoItem(1, "Walk the dog", "Take a walk with the dog",
                LocalDate.of(2025,1,28), false, person1 );
        TodoItem todoItem2 = new TodoItem(2, "Feed the dog", "Give the dog food",
                LocalDate.of(2025,1,28), false, person1 );
        System.out.println(todoItem1.getSummary());
        System.out.println(todoItem2.getSummary());
        TodoItemTask todoItemTask1 = new TodoItemTask(1, todoItem1.getTitle(), person1);
        TodoItemTask todoItemTask2 = new TodoItemTask(2, todoItem2.getTitle(), person2);
        System.out.println(todoItemTask1.getSummary());
        System.out.println(todoItemTask2.getSummary());
    }
}