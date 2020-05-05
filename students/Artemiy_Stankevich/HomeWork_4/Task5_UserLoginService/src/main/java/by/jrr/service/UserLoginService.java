package by.jrr.service;

import by.jrr.bean.User;

public class UserLoginService {

    public boolean login(User user, String password) {
        int countTries = user.getCountLoginAttempts();

        if (user.isBlocked()) {
            System.out.println("User is blocked: number of attempts exceeded 3");
            return false;
        }

        boolean PasswordValid = user.getPassword() == password;
        if (PasswordValid) {
            user.resetTries();
        } else {
            countTries = countTries - 1;
            user.setCountLoginAttempts(countTries);
        }
        if (countTries == 0) {
            user.setBlocked(true);
        }
        return PasswordValid;
    }
}
