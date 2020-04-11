package by.jrr;

import by.jrr.bean.User;
import by.jrr.service.UserService;

public class App {
    public static void main(String[] args) {
        User user = new User("Vasya", 34);
        UserService userService = new UserService();
        userService.saveUser(user);

        User userFromRepository = userService.findUserByName("Vasya");
        System.out.println("userFromRepository = " + userFromRepository);
    }
}
