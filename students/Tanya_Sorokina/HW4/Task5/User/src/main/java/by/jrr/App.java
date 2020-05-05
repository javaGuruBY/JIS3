package by.jrr;

import by.jrr.bean.User;
import by.jrr.service.UserService;

public class App {
    public static void main(String[] args) {
        User gloria = new User("Gloria", "12345");
        UserService userService = new UserService();
    }
}
