package service;

import by.abs.bean.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationServiceTest {

    UserValidationService service;
    User user;

    @BeforeEach
    void setUp() {
     service = new UserValidationService();
     User user = new User("adam", "nasser", 2);
    }

    @Test
    void validate() {
        User user = new User("adam", "nasser", 2);
        boolean actual = service.validate(user);
        assertTrue(actual);
    }

    @Test
    void checkUserFirstName() {
        User user = new User("adam", "nasser", 2);
        boolean actual = service.checkUserFirstName("adam");
        assertTrue(actual);
    }

    @Test
    void checkUserLastName() {
        User user = new User("adam", "nasser", 2);
        boolean actual = service.checkUserFirstName("nasser");
        assertTrue(actual);
    }

    @Test
    void checkUserAge() {
        User user = new User("adam", "nasser", 2);
        boolean actual = service.checkUserAge(2);
        assertTrue(actual);
    }
}