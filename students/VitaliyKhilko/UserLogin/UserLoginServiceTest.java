import bean.User;
import service.UserLoginService;

class UserLoginServiceTest {
    public static void main(String[] args) {
        UserLoginServiceTest testRunner = new UserLoginServiceTest();
        testRunner.UserBlocked();
    }

    public void UserBlocked(){
        String testDescription = "User blocked";

        UserLoginService serviceLogin = new UserLoginService();
        User user = new User("User", "161616");
        boolean expectedResult = true;
        boolean actualResult = serviceLogin.login(user, "161616");
        checkThatEqual(expectedResult, actualResult, testDescription);
    }

    public void checkThatEqual(boolean expected, boolean actual, String testDescription) {
        if (expected == actual) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("expected \"" + expected + "\", but was \"" + actual + "\"");
        }

    }
}

