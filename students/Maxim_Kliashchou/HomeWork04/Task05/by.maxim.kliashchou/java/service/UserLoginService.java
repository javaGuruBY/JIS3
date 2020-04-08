package service;

import bean.User;

public class UserLoginService {
    private UserService userService = new UserService();

    public boolean login(User user, String password){
        if (user.isBlocked()){
            return false;
        }

        if (!user.getPassword().equals(password)){
            decreaseUserAttempts(user);
            return false;
        }

        userService.refreshUserAttempts(user);
        return true;
    }

    private void decreaseUserAttempts(User user) {
        user.setAttemptsBeforeBlock(user.getAttemptsBeforeBlock() - 1);
        if (user.getAttemptsBeforeBlock() == 0){
            userService.blockUser(user);
        }
    }
}
