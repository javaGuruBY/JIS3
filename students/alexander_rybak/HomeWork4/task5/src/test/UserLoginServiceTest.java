package test;

import bean.User;
import service.UserLoginService;

public class UserLoginServiceTest {
    public static void main(String[] args) {
        UserLoginServiceTest testRunner = new UserLoginServiceTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
    }

    public void checkThatEqual(boolean expected, boolean actual, String testDescription) {
        if (expected == actual) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("expected \"" + expected + "\", but was \"" + actual + "\"");
        }
    }

    public void test1() {
        String testDescription = "Should return  true";

        UserLoginService service = new UserLoginService();
        User user = new User("user", "123456");

        boolean expected = true;
        boolean actual = service.login(user, "123456");

        checkThatEqual(expected, actual, testDescription);
    }

    public void test2() {
        String testDescription = "Should block user";

        UserLoginService service = new UserLoginService();
        User user = new User("user", "123456");
        service.login(user, "12345635");
        service.login(user, "123453456");
        service.login(user, "1234563532");

        boolean expected = true;
        boolean actual = user.isBlocked();

        checkThatEqual(expected, actual, testDescription);
    }

    public void test3() {
        String testDescription = "Should return false";

        UserLoginService service = new UserLoginService();
        User user = new User("user", "123456");

        boolean expected = false;
        boolean actual = service.login(user, "123wertgd7");

        checkThatEqual(expected, actual, testDescription);
    }
}