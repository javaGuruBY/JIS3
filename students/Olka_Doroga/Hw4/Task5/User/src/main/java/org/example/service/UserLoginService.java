package org.example.service;

import org.example.bean.User;

public class UserLoginService {
    public boolean login(User user, String password) {
       if (password.equals(user.getPassword())) {
           if (user.isBlocked()) {
               user.resetAttempts(user);
           } return true;
       } else if (!password.equals(user.getPassword())) {
           user.setAttemptsBeforeBlock(user.getAttemptsBeforeBlock() - 1);
           if (user.getAttemptsBeforeBlock() == 0) {
               user.blockUser(user);
           }
        } return false;

    }
}
