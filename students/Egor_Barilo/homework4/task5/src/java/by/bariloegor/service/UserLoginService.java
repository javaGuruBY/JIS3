package by.bariloegor.service;

import by.bariloegor.bean.User;
import by.bariloegor.settings.Settings;

public class UserLoginService {
    public boolean login(User user, String password) {
        if(!user.isBlocked()){
            return performLoginProcess(user,password);
        } else {
            return false;
        }
    }

    public boolean performLoginProcess(User user, String password){
        if (password.equals(user.getPassword())) {
                dropMaxLoginAttemptsToDefault(user);
                return true;
        } else {
            decrementMaxLoginAttempts(user);
            return false;
        }
    }

    public void decrementMaxLoginAttempts(User user){
        user.setMaxLoginAttemptsLeft(user.getMaxLoginAttemptsLeft()-1);
        if(user.getMaxLoginAttemptsLeft() == 0){
            this.blockUser(user);
        }
    }

    public void dropMaxLoginAttemptsToDefault(User user) {
        user.setMaxLoginAttemptsLeft(Settings.MAX_LOGIN_ATTEMPTS);
    }

    public void blockUser(User user) {
        user.setBlocked(true);
    }

}
