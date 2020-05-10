package service;
import bean.User;

public class UserLoginService {
    public boolean login(User user, String password) {
        int attempt = user.getAttempt();

        if (user.UserIsBlocked()) {
            System.out.println("User is blocked");
            return false;
        }


        boolean isPassCorr = user.getPassword().equals(password);
        if (isPassCorr) {
            user.resetAttempt();
        } else {
            attempt = attempt - 1;
            user.setAttempt(attempt);
        }

        if (attempt == 0) {
            user.setUserIsBlocked(true);
        }

        return isPassCorr;
    }
}
