package by.bariloegor.test;

import by.bariloegor.bean.User;
import by.bariloegor.service.UserLoginService;
import by.bariloegor.settings.Settings;

public class UserLoginTest {
    private User user = new User("Name", "qwerty", Settings.MAX_LOGIN_ATTEMPTS);
    private UserLoginService userLoginService = new UserLoginService();

    private void setUserDefaultValue(User user){
        user.setBlocked(false);
        user.setMaxLoginAttemptsLeft(Settings.MAX_LOGIN_ATTEMPTS);
    }

    private void assertBooleanResults(String testName, Boolean expected, Boolean actual){
        boolean result = expected == actual;
        if(result){
            System.out.println("[INFO] " + testName + " test passed successfully.");
        } else {
            System.out.println("[ERROR] " + testName + " test failed. Expected '" + expected +
                    "' but was '" + actual + "'");
        }
    }

    private void assertIntegerResults(String testName, int expected, int actual){
        boolean result = expected == actual;
        if(result){
            System.out.println("[INFO] " + testName + " test passed successfully.");
        } else {
            System.out.println("[ERROR] " + testName + " test failed. Expected '" + expected +
                    "' but was '" + actual + "'");
        }
    }

    private void blockUserTest(){
        boolean expected = true;
        userLoginService.blockUser(user);
        boolean actual = user.isBlocked();
        assertBooleanResults("'User should be blocked'", expected, actual);
        setUserDefaultValue(user);
    }

    private void dropMaxLoginAttemptsToDefaultTest(){
        user.setMaxLoginAttemptsLeft(0);
        userLoginService.dropMaxLoginAttemptsToDefault(user);
        int expected = Settings.MAX_LOGIN_ATTEMPTS;
        int actual = user.getMaxLoginAttemptsLeft();
        assertIntegerResults("'User max login attempts should be default(3)'", expected, actual);
        setUserDefaultValue(user);
    }

    private void decrementMaxLoginAttemptsTest(){
        userLoginService.decrementMaxLoginAttempts(user);
        int expected = Settings.MAX_LOGIN_ATTEMPTS - 1;
        int actual = user.getMaxLoginAttemptsLeft();
        assertIntegerResults("'User max login attempts should be 2'", expected, actual);
        setUserDefaultValue(user);
    }

    private void performLoginProcessTest(){
        boolean firstExpected = true;
        boolean firstActual = userLoginService.performLoginProcess(user, "qwerty");
        assertBooleanResults("'User should logged in'", firstExpected, firstActual);
        setUserDefaultValue(user);

        int secondExpected = Settings.MAX_LOGIN_ATTEMPTS-1;
        userLoginService.performLoginProcess(user, "qwe");
        int secondActual = user.getMaxLoginAttemptsLeft();
        assertIntegerResults("'Failed login,user login attempts should be 2'", secondExpected, secondActual);
        setUserDefaultValue(user);
    }

    private void loginTest(){
        boolean firstExpected = true;
        boolean firstActual = userLoginService.login(user, "qwerty");
        assertBooleanResults("'User should logged in'", firstExpected, firstActual);
        setUserDefaultValue(user);

        userLoginService.blockUser(user);
        boolean secondExpected = false;
        boolean secondActual = userLoginService.login(user, "qwerty");
        assertBooleanResults("'User should be blocked'", secondExpected, secondActual);
        setUserDefaultValue(user);
    }

    public void userLoginTest(){
        loginTest();
        decrementMaxLoginAttemptsTest();
        blockUserTest();
        dropMaxLoginAttemptsToDefaultTest();
        performLoginProcessTest();
    }
}
