package test;

import bean.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.UserService;
import settings.UserSettings;

public class UserServiceJUnitTest extends Assert {
    private User user = new User();
    private UserService service = new UserService();

    @Before
    public void setUp(){
        user = new User("login", "password");
        service = new UserService();
    }

    @Test
    public void refreshUserAttemptsTest(){
        String testMessage = "Should refresh user attempts";
        user.setAttemptsBeforeBlock(1);
        service.refreshUserAttempts(user);
        int expected = UserSettings.MAXIMAL_ATTEMPTS_BEFORE_BLOCK;
        int actual = user.getAttemptsBeforeBlock();
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void blockUserTest(){
        String testMessage = "Should block user";
        service.blockUser(user);
        boolean expected = true;
        boolean actual = user.isBlocked();
        assertEquals(testMessage, expected, actual);
    }
}
