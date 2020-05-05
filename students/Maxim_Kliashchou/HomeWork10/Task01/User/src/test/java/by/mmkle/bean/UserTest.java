package by.mmkle.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        user = new User();
    }

    @Test
    void firstName() {
        String testMessage = "Should set and get first name";
        user.setFirstName("max");
        String expected = "max";
        String actual = user.getFirstName();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void lastName() {
        String testMessage = "Should set and get last name";
        user.setLastName("kle");
        String expected = "kle";
        String actual = user.getLastName();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void age() {
        String testMessage = "Should set and get age";
        user.setAge(15);
        int expected = 15;
        int actual = user.getAge();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void testEquals() {
        String testMessage = "Should return true if objects are equal";
        user = new User("max", "kle", 15);
        Object[] users = {
                new User("max", "kle", 15),
                new User("ma", "kle", 15),
                new User("max", "kl", 15),
                new User("max", "kle", 14),
                new Object(),
                user,
                null
        };
        boolean[] expected = {true, false, false, false, false, true, false};
        for (int i = 0; i < expected.length; i++){
            boolean actual = user.equals(users[i]);
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void testHashCode() {
        String testMessage = "Should return same hash if objects are equal";
        user = new User("max", "kle", 15);
        Object[] users = {
                new User("max", "kle", 15),
                new User("ma", "kle", 15),
                new User("max", "kl", 15),
                new User("max", "kle", 14),
                new Object(),
                user
        };
        boolean[] expected = {true, false, false, false, false, true};
        for (int i = 0; i < expected.length; i++){
            boolean actual = user.hashCode() == users[i].hashCode();
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void testToString() {
        String testMessage = "Should return same object string";
        user = new User("max", "kle", 15);
        String expected = "User{firstName='max', lastName='kle', age=15}";
        String actual = user.toString();
        assertEquals(expected, actual, testMessage);
    }
}