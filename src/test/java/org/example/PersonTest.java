package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PersonTest {

    @Test
    public void testSetFirstNameValid() {
        Person person = new Person(1, "Hernan", "Leiva", "hleiva@hotmail.com");
        person.setFirstName("John");
        assertEquals("John", person.getFirstName());
    }

    @Test
    public void testSetFirstNameNull() {
        Person person = new Person(1, "Hernan", "Leiva", "hleiva@hotmail.com");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            person.setFirstName(null);
        });
        assertEquals("The lastname can't be empty!", exception.getMessage());
    }

    @Test
    public void testSetFirstNameEmpty() {
        Person person = new Person(1, "Hernan", "Leiva", "hleiva@hotmail.com");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            person.setFirstName("");
        });
        assertEquals("The lastname can't be empty!", exception.getMessage());
    }

    @Test
    public void testSetFirstNameBlank() {
        Person person = new Person(1, "Hernan", "Leiva", "hleiva@hotmail.com");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            person.setFirstName("   ");
        });
        assertEquals("The lastname can't be empty!", exception.getMessage());
    }
}


