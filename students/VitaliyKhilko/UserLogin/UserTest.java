import bean.User;

public class UserTest {
    public static void main(String[] args) {
        UserTest name = new UserTest();
        name.incorrectLoginAndPassword();
        name.correctLogin();
        name.correctPassword();
        name.logAndPassEmpty();
    }


    public void incorrectLoginAndPassword() {
        String testDescription = "Login and password do not match";

        User name2 = new User("qwerty", "666666");
        boolean expectedResult = false;
        boolean actualResult = (name2.getUser()).equals(name2.getPassword());
        checkThatEqual(expectedResult, actualResult, testDescription);
    }


    public void correctLogin() {
        String testDescription = "Login incorrect";

        User name2 = new User("", "666666");
        boolean expectedResult = false;
        boolean actualResult = (name2.getUser()).equals(name2.getPassword());
        checkThatEqual(expectedResult, actualResult, testDescription);
    }


    public void correctPassword() {
        String testDescription = "Password incorrect";

        User name2 = new User("qwerty", "");
        boolean expectedResult = false;
        boolean actualResult = (name2.getUser()).equals(name2.getPassword());
        checkThatEqual(expectedResult, actualResult, testDescription);
    }


    public void logAndPassEmpty() {
        String testDescription = "Log and pass incorrect";

        User name2 = new User("", "");
        boolean expectedResult = true;
        boolean actualResult = (name2.getUser()).equals(name2.getPassword());
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
