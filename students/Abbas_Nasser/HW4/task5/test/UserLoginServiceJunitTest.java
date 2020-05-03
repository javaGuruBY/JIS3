package test;

import bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.UserLoginService;

 class UserLoginServiceJUnitTest extends Assert {
    private User user = new User();
    private UserLoginService userLoginService = new UserLoginService();

    @Before
    public void setUp(){
        user = new User("login", "password");
        userLoginService = new UserLoginService();
    }

    @Test
    public void loginTest(){
        String testMessage = "let the user in";
        boolean expected = true;
        boolean actual = userLoginService.login(user, "password");
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void decreaseUserAttemptsTest(){
        String testMessage = "decrease login attempts by 1";
        int expected = 2;
        userLoginService.login(user, "wrong_password");
        int actual = user.getLoginAttempts();
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void noLogInAfterThreeWrongAttenptsTest(){
        String testMessage = "block user after 3 failed attempts";
        boolean expected = false;
        userLoginService.login(user, "wrong_password");
        userLoginService.login(user, "wrong_password");
        userLoginService.login(user, "wrong_password");
        boolean actual = userLoginService.login(user, "password");
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void noLogInForBlockedUserTest(){
        String testMessage = "do not let a blocked user in";
        user.setBlocked(true);
        boolean expected = false;
        boolean actual = userLoginService.login(user, "password");
        assertEquals(testMessage, expected, actual);
    }
}