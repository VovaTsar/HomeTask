package com.task.object;

import org.junit.Before;
import org.junit.Test;

import javax.xml.bind.ValidationException;

import static org.junit.Assert.*;

public class UserTest {
    User user1;
    User user2;
    User user3;

    @Before
    public void setUp() throws ValidationException {
        Address address = new Address("Kyiv", 777);
        user1 = new User(null, "Ts", 20, true, address);
        user2 = new User("Roma", "Ts", 20, true, address);
        user3 = new User(null, "Ts", 20, true, address);
    }

    @Test
    public void shouldReturnEquals() {
        boolean resultUser1aAndUser2 = user1.equals(user2);
        boolean resultUser1aAndUser3 = user1.equals(user3);
        assertFalse(resultUser1aAndUser2);
        assertTrue(resultUser1aAndUser3);

    }

    @Test
    public void shouldReturnHashCode() {
        boolean hashCode = user1.hashCode() == user2.hashCode();
        assertTrue(hashCode);
        hashCode = user2.hashCode() == user3.hashCode();
        assertTrue(hashCode);
    }
}