package service;

import bean.User;
import settings.UserSettings;

public class UserService {
    public void refreshUserAttempts(User user){
        user.setLoginAttempts(UserSettings.MAXIMUM_ATTEMPTS_BEFORE_BLOCK);
    }

    public void blockUser(User user){
        user.setBlocked(true);
    }
}
