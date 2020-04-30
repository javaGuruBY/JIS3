package by.mmkle.bean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    User user;

    @Before
    public void setUp() throws Exception {
        user = new User();
    }

    @Test
    public void id() {
        String testMessage ="Should set and get id";
        user.setId(6);
        int expected = 6;
        int actual = user.getId();
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void name() {
        String testMessage ="Should set and get name";
        user.setName("max");
        String expected = "max";
        String actual = user.getName();
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void age() {
        String testMessage ="Should set and get age";
        user.setAge(26);
        int expected = 26;
        int actual = user.getAge();
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void testEquals() {
        String testMessage = "Should return true if objects are equal";
        user = new User(1, "max", 25);
        Object[] users = {
                new User(1, "max", 25),
                new User(2, "max", 25),
                new User(1, "ma", 25),
                new User(1, "max", 2),
                new Object(),
                user,
                null
        };

        boolean[] expected = {true, false, false, false, false, true, false};
        for (int i = 0; i < expected.length; i++){
            boolean actual = user.equals(users[i]);
            assertEquals(testMessage, expected[i], actual);
        }
    }

    @Test
    public void testHashCode() {
        String testMessage = "Should return true if objects are equal";
        user = new User(1, "max", 25);
        Object[] users = {
                new User(1, "max", 25),
                new User(2, "max", 25),
                new User(1, "ma", 25),
                new User(1, "max", 2),
                new Object(),
                user
        };

        boolean[] expected = {true, false, false, false, false, true};
        for (int i = 0; i < expected.length; i++){
            boolean actual = user.hashCode() == users[i].hashCode();
            assertEquals(testMessage, expected[i], actual);
        }
    }
}