package org.example.bean;

import org.example.service.UserLoginService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void resetAttempts() {
        User user = new User();
        int expected = 3;
        user.setAttemptsBeforeBlock(1);
        user.resetAttempts(user);
        int actual = user.getAttemptsBeforeBlock();
        assertEquals(expected, actual, "false1");
    }

    @Test
    void blockUser() {
        User user = new User ();
        boolean expected = true;
        user.blockUser(user);
        boolean actual = user.isBlocked();
        assertEquals(expected, actual, "false2");
    }
}