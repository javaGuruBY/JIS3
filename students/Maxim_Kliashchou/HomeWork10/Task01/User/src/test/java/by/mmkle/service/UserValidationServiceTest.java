package by.mmkle.service;

import by.mmkle.bean.User;
import by.mmkle.exception.UserValidationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationServiceTest {
    private UserValidationService service;

    @BeforeEach
    void setUp(){
        service = new UserValidationService();
    }
    @Test
    void validationWithOutExceptions() {
        String testMessage = "Should validate user info";
        boolean expected = true;
        User user = new User("max", "kle", 15);
        boolean actual = service.validation(user);
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void validationUserFirstNameLessExceptions() {
        User user = new User("ma", "kle", 15);
        Exception exception = Assertions.assertThrows(UserValidationException.class, () -> service.validation(user));

        assertTrue(exception.getMessage().equals("Invalid user first name"));
    }

    @Test
    void validationUserFirstNameMoreExceptions() {
        User user = new User("mafjsdjdjdjdjdjdjdjjddjdjdj", "kle", 15);
        Exception exception = Assertions.assertThrows(UserValidationException.class, () -> service.validation(user));

        assertTrue(exception.getMessage().equals("Invalid user first name"));
    }

    @Test
    void validationUserLastNameLessExceptions() {
        User user = new User("max", "kl", 15);
        Exception exception = Assertions.assertThrows(UserValidationException.class, () -> service.validation(user));

        assertTrue(exception.getMessage().equals("Invalid user last name"));
    }

    @Test
    void validationUserLastNameMoreExceptions() {
        User user = new User("max", "kljfjfjfjfjfjfjfjjfjfjfjf", 15);
        Exception exception = Assertions.assertThrows(UserValidationException.class, () -> service.validation(user));

        assertTrue(exception.getMessage().equals("Invalid user last name"));
    }

    @Test
    void validationUserAgeMoreExceptions() {
        User user = new User("max", "kle", 155);
        Exception exception = Assertions.assertThrows(UserValidationException.class, () -> service.validation(user));

        assertTrue(exception.getMessage().equals("Invalid user age"));
    }

    @Test
    void validationUserAgeLessExceptions() {
        User user = new User("max", "kle", -5);
        Exception exception = Assertions.assertThrows(UserValidationException.class, () -> service.validation(user));

        assertTrue(exception.getMessage().equals("Invalid user age"));
    }




}