package by.rybak.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        user = new User("Alexander", "Rybak", 19);
    }

    @Test
    void getFirstName() {
        String expected = "Alexander";
        String actual = user.getFirstName();

        assertEquals(expected, actual, "Should return right first name...");
    }

    @Test
    void setFirstName() {
        user.setFirstName("Oleg");
        String expected = "Oleg";
        String actual = user.getFirstName();

        assertEquals(expected, actual, "Should right set first name...");
    }

    @Test
    void getSecondName() {
        String expected = "Rybak";
        String actual = user.getSecondName();

        assertEquals(expected, actual, "Should return right second name...");
    }

    @Test
    void setSecondName() {
        user.setSecondName("Buyan");
        String expected = "Buyan";
        String actual = user.getSecondName();

        assertEquals(expected, actual, "Should right set second name...");
    }

    @Test
    void getAge() {
        int expected = 19;
        int actual = user.getAge();

        assertEquals(expected, actual, "Should return right age...");
    }

    @Test
    void setAge() {
        user.setAge(10);
        int expected = 10;
        int actual = user.getAge();

        assertEquals(expected, actual, "Should right set age...");
    }

    @Test
    void testEquals() {
        User user1 = new User("Alexander", "Rybak", 19);
        User user2 = new User("Ivan", "Ivanov", 23);
        boolean actual = user.equals(user1);
        boolean actual1 = user.equals(user);
        boolean actual2 = user.equals(user2);

        assertTrue(actual);
        assertTrue(actual1);
        assertFalse(actual2);
    }
}