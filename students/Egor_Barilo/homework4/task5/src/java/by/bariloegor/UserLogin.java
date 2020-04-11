package by.bariloegor;

import by.bariloegor.bean.User;
import by.bariloegor.settings.Settings;
import by.bariloegor.test.UserLoginTest;
import by.bariloegor.service.UserLoginService;

public class UserLogin {
    public static void main(String[] args) {
        UserLoginTest userLoginTest = new UserLoginTest();
        userLoginTest.userLoginTest();

        UserLoginService userLoginService = new UserLoginService();
        User firstUser = new User("Egor", "12345", Settings.MAX_LOGIN_ATTEMPTS);
        userLoginService.login(firstUser, "12345");
    }
}
