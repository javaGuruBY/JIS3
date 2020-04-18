package org.example.service;

import org.example.bean.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserLoginServiceTest {

    @Test
    void login(){
        User user = new User("Olya", "123");
        boolean expected = true;
        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.login (user, "123");
        assertEquals(expected, actual, "login");
    }

    @Test
    void login2(){
        User user = new User("Olya", "123");
        boolean expected = false;
        UserLoginService userLoginService = new UserLoginService();
        boolean actual = userLoginService.login (user, "234");
        assertEquals(expected, actual, "login2");
    }




}