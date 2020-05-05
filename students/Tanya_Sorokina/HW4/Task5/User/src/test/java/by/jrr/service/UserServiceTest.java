package by.jrr.service;
import by.jrr.bean.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserServiceTest {

    User userTest;
    UserService userServiceTest;

    @BeforeEach
    void init() {
        User userTest = new User();
        UserService userServiceTest1 = new UserService();
    }



    @Test
    public void checkLoginValid() throws Exception {
        userTest.setLogin("Gloria");
        userTest.setPassword("12345");
        boolean expected = true;
        boolean actual = userServiceTest.login(userTest, "12345");
        assertEquals(true, actual, "Error");
    }



    @Test
    public void checkLoginInValid() throws Exception {
        userTest.setLogin("Gloria_Gloria");
        userTest.setPassword("12345");
        boolean expected = false;
        boolean actual = userServiceTest.login(userTest, "54321");
        assertEquals(false, actual, "Error");
    }

    @Test
    public void inBlockedTest() throws Exception {
        userTest.setCountLoginAttempts(0);
        userTest.setInBlocked(true);
        boolean expected = true;
        boolean actual = userTest.isInBlocked();
        assertEquals(true, actual, "Error");
    }
}