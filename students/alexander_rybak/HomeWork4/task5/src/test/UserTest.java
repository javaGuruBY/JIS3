package test;

import bean.User;

public class UserTest {

    public static void main(String[] args) {
        UserTest testRunner = new UserTest();
        testRunner.test1();
    }

    public void checkThatEqual(int expected, int actual, String testDescription) {
        if (expected == actual) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("expected \"" + expected + "\", but was \"" + actual + "\"");
        }

    }

    public void test1() {
        String testDescription = "Should return expected count of attempts to enter the account";

        User user = new User("qwerty", "123456");

        int expected = 0;
        int actual = user.getCountOfAttemptsToEnterTheAccount();

        checkThatEqual(expected, actual, testDescription);
    }
}