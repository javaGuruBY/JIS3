package by.jrr;

import by.jrr.bean.User;
import by.jrr.service.UserLoginService;

public class App {
    public static void main(String[] args) {
        User ticon = new User("Ticon", "2");
        UserLoginService userLoginService = new UserLoginService();
    }
}
