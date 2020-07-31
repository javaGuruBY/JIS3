package by.jrr.service;

import by.jrr.bean.User;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationServiceTest {
    User userTest1;
    UserValidationService serviceTest;

    @BeforeEach
    public void setUp (){
        userTest1 = new User("Bob", "Cool", 23);
        serviceTest = new UserValidationService();
    }


    @org.junit.jupiter.api.Test
    void validateTest() {
        boolean expected = true;
        boolean actual = serviceTest.validate(userTest1);
        assertEquals(expected, actual, "[Error]");
    }

    @org.junit.jupiter.api.Test
    void minMaxLengthUsrFirstNameTest() {
        boolean expected = true;
        boolean actual = serviceTest.minMaxLengthUsrFirstName("Jim");
        assertEquals(expected, actual, "[Error]");
    }

    @org.junit.jupiter.api.Test
    void minMaxLengthUsrLastNameTest() {
        boolean expected = true;
        boolean actual = serviceTest.minMaxLengthUsrLastName("Curt");
        assertEquals(expected, actual, "[Error]");
    }

    @org.junit.jupiter.api.Test
    void minMaxLengthUsrAgeTest() {
        boolean expected = true;
        boolean actual = serviceTest.minMaxLengthUsrAge(15);
        assertEquals(expected, actual, "[Error]");
    }
}