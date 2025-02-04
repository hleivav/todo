package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testConstructorAndGetters() {
        Person person = new Person(1, "John", "Doe", "john.doe@example.com", "credentials123");

        assertEquals(1, person.getId());
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals("john.doe@example.com", person.getEmail());
        assertEquals("credentials123", person.getCredentials());
    }

    @Test
    public void testSetFirstName() {
        Person person = new Person(1, "John", "Doe", "john.doe@example.com", "credentials123");
        person.setFirstName("Jane");

        assertEquals("Jane", person.getFirstName());
    }

    @Test
    public void testSetLastName() {
        Person person = new Person(1, "John", "Doe", "john.doe@example.com", "credentials123");
        person.setLastName("Smith");

        assertEquals("Smith", person.getLastName());
    }

    @Test
    public void testSetEmail() {
        Person person = new Person(1, "John", "Doe", "john.doe@example.com", "credentials123");
        person.setEmail("jane.smith@example.com");

        assertEquals("jane.smith@example.com", person.getEmail());
    }

    @Test
    public void testSetCredentialsValid() {
        Person person = new Person(1, "John", "Doe", "john.doe@example.com", "initialCredentials");
        person.setCredentials("newCredentials");
        assertEquals("newCredentials", person.getCredentials());
    }

    @Test
    public void testSetCredentialsNull() {
        Person person = new Person(1, "John", "Doe", "john.doe@example.com", "initialCredentials");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            person.setCredentials(null);
        });
        assertEquals("The credentials can't be empty!", exception.getMessage());
    }

    @Test
    public void testSetCredentialsEmpty() {
        Person person = new Person(1, "John", "Doe", "john.doe@example.com", "initialCredentials");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            person.setCredentials("");
        });
        assertEquals("The credentials can't be empty!", exception.getMessage());
    }

    @Test
    public void testSetCredentialsWhitespace() {
        Person person = new Person(1, "John", "Doe", "john.doe@example.com", "initialCredentials");
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            person.setCredentials("   ");
        });
        assertEquals("The credentials can't be empty!", exception.getMessage());
    }

    @Test
    public void testGetSummary() {
        Person person = new Person(1, "John", "Doe", "john.doe@example.com", "credentials123");
        String summary = person.getSummary();

        assertEquals("id: 1, name: John Doe email: john.doe@example.com", summary);
    }

    @Test
    public void testToString() {
        Person person = new Person(1, "John", "Doe", "john.doe@example.com", "credentials123");
        String toString = person.toString();

        assertEquals("id: 1, name: John Doe email: john.doe@example.com role: ", toString);
    }

    @Test
    public void testConstructorWithInvalidFirstName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Person(1, "", "Doe", "john.doe@example.com", "credentials123");
        });

        assertEquals("The firstname can't be empty!", exception.getMessage());
    }

    @Test
    public void testConstructorWithInvalidLastName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Person(1, "John", "", "john.doe@example.com", "credentials123");
        });

        assertEquals("The lastname can't be empty!", exception.getMessage());
    }

    @Test
    public void testConstructorWithInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Person(1, "John", "Doe", "", "credentials123");
        });

        assertEquals("The email can't be empty!", exception.getMessage());
    }
}