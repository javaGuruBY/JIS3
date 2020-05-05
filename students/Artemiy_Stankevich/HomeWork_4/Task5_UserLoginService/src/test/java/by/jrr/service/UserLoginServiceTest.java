package by.jrr.service;

import by.jrr.bean.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class UserLoginServiceTest {
    User userTest;
    UserLoginService userLoginServiceTest;

    @BeforeEach
    void init() {
        userTest = new User();
        userLoginServiceTest = new UserLoginService();
    }
    @Test
    public void checkLoginValid() {
        userTest.setLogin("Ticon");
        userTest.setPassword("129357");
        boolean expected = true;
        boolean actual = userLoginServiceTest.login(userTest, "129357");
        assertEquals(expected, actual, "Error");
    }

    @Test
    public void checkLoginInValid() {
        userTest.setLogin("Ticondrys");
        userTest.setPassword("2020327");
        boolean expected = false;
        boolean actual = userLoginServiceTest.login(userTest, "129357");
        assertEquals(expected, actual, "Error");
    }

    @Test
    public void isBlockedTest () {
        userTest.setCountLoginAttempts(0);
        userTest.setBlocked(true);
        boolean expected = true;
        boolean actual = userTest.isBlocked();
        assertEquals(expected, actual, "Error");
    }

}