package by.rybak.bean;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    public void setUp(){
        user = new User("23", "Alex", 19);
    }

    @Test
    void getId() {
        String expected = "23";
        String actual = user.getId();
        assertEquals(expected, actual);
    }

    @Test
    void setId() {
        String expected = "44";
        user.setId("44");
        String actual = user.getId();
        assertEquals(expected, actual);
    }

    @Test
    void getName() {
        String expected = "Alex";
        String actual = user.getName();
        assertEquals(expected, actual);
    }

    @Test
    void setName() {
        String expected = "Ivan";
        user.setName("Ivan");
        String actual = user.getName();
        assertEquals(expected, actual);
    }

    @Test
    void getAge() {
        int expected = 19;
        int actual = user.getAge();
        assertEquals(expected, actual);
    }

    @Test
    void setAge() {
        int expected = 55;
        user.setAge(55);
        int actual = user.getAge();
        assertEquals(expected, actual);
    }

    @Test
    void testEquals() {
        User user2 = new User("23", "Alex", 19);
        User user3 = new User();
        boolean actual = user.equals(user2);
        boolean actual1 = user.equals(user);
        boolean actual2 = user.equals(user3);

        assertTrue(actual);
        assertTrue(actual1);
        assertFalse(actual2);
    }
}