package service;

import bean.User;
import settings.UserSettings;

public class UserService {
    public void refreshUserAttempts(User user){
        user.setAttemptsBeforeBlock(UserSettings.MAXIMAL_ATTEMPTS_BEFORE_BLOCK);
    }

    public void blockUser(User user){
        user.setBlocked(true);
    }
}
