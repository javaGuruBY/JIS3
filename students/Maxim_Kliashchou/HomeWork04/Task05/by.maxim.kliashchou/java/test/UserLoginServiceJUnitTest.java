package test;

import bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.UserLoginService;

public class UserLoginServiceJUnitTest extends Assert {
    private User user = new User();
    private UserLoginService userLoginService = new UserLoginService();

    @Before
    public void setUp(){
        user = new User("login", "password");
        userLoginService = new UserLoginService();
    }

    @Test
    public void loginTest(){
        String testMessage = "Should log in user";
        boolean expected = true;
        boolean actual = userLoginService.login(user, "password");
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void decreaseUserAttemptsTest(){
        String testMessage = "Should decrease user attempts";
        int expected = 2;
        userLoginService.login(user, "wrong_password");
        int actual = user.getAttemptsBeforeBlock();
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void noLogInAfterThreeWrongAttenptsTest(){
        String testMessage = "Shouldn't log in user after 3 wrong passwords";
        boolean expected = false;
        userLoginService.login(user, "wrong_password");
        userLoginService.login(user, "wrong_password");
        userLoginService.login(user, "wrong_password");
        boolean actual = userLoginService.login(user, "password");
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void noLogInForBlockedUserTest(){
        String testMessage = "Shouldn't log in blocked user";
        user.setBlocked(true);
        boolean expected = false;
        boolean actual = userLoginService.login(user, "password");
        assertEquals(testMessage, expected, actual);
    }
}
