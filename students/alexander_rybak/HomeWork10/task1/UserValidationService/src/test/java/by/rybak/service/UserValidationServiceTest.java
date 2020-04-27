package by.rybak.service;

import by.rybak.bean.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationServiceTest {
    User user;
    UserValidationService service;

    @BeforeEach
    public void setUp(){
        user = new User("Alexander", "Rybak", 19);
        service = new UserValidationService();
    }

    @Test
    void validate() {
        boolean actual = service.validate(user);

        assertTrue(actual);
    }

    @Test
    void checkUserFirstName() {
        boolean actual = service.checkUserFirstName(user);

        assertTrue(actual);
    }

    @Test
    void checkUserSecondName() {
        boolean actual = service.checkUserSecondName(user);

        assertTrue(actual);
    }

    @Test
    void checkUserAge() {
        boolean actual = service.checkUserAge(user);

        assertTrue(actual);
    }
}