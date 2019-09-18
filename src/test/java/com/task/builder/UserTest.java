package com.task.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void shouldReturnCorrectField() {
        User user = new User.Builder()
                .withName("Vova")
                .withSurname("Ts")
                .withEmail("qwerty@12345gmail.com")
                .withPassword("12345")
                .withCode(777).build();
        assertEquals("Vova", user.getName());
        assertEquals("Ts", user.getSurname());
        assertEquals("qwerty@12345gmail.com", user.getEmail());
        assertEquals("12345", user.getPassword());
        assertEquals(777, user.getCode());

    }

    @Test
    public void shouldReturnCorrectFieldWithNull() {
        User user = new User.Builder()
                .withName("Vova")
                .withSurname("Ts")
                .withPassword("12345")
                .withCode(777).build();
        assertEquals("Vova", user.getName());
        assertEquals("Ts", user.getSurname());
        assertNull(user.getEmail());
        assertEquals("12345", user.getPassword());
        assertEquals(777, user.getCode());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnIllegalArgumentException() {
        new User.Builder()
                .withName("Vova")
                .withSurname("Ts")
                .withEmail("qwerty@12345gmail.com")
                .withPassword("12345")
                .withCode(-777).build();
    }

}