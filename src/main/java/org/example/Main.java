package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AppUser appUser1 = new AppUser("herlei", "abc123", AppRole.ROLE_APP_ADMIN);
        AppUser appUser2 = new AppUser("seblei", "efg456", AppRole.ROLE_APP_USER);
        Person person1 = new Person(1, "Hernan", "Leiva", "hleiva@hotmail.com", appUser1.getUsername());
        Person person2 = new Person(2, "Sebastian", "Leiva", "sebleiva@hotmail.com", appUser2.getUsername());

        System.out.println(appUser1.toString());
        System.out.println(appUser2.toString());
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        TodoItem todoItem1 = new TodoItem(1, "Walk the dog", "Take a walk with the dog",
                LocalDate.of(2025,10,28), false, person1 );
        TodoItem todoItem2 = new TodoItem(2, "Feed the dog", "Give the dog food",
                LocalDate.of(2025,5,28), false, person1 );
        System.out.println(todoItem1.getSummary());
        System.out.println(todoItem2.getSummary());
        TodoItemTask todoItemTask1 = new TodoItemTask(1, todoItem1.getTitle(), person1);
        TodoItemTask todoItemTask2 = new TodoItemTask(2, todoItem2.getTitle(), person2);
        System.out.println(todoItemTask1.getSummary());
        System.out.println(todoItemTask2.getSummary());
    }
}