package service;

import bean.User;

public class UserLoginService {

    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();
        User firstUser = new User("login", "1234");
        System.out.println(service.login(firstUser, "123"));
        System.out.println(service.login(firstUser, "123"));
        System.out.println(service.login(firstUser, "1234"));

    }

    public boolean login(User user, String password) {
        if (user.isBlocked() != true && user.getPassword().equals(password)) {
            user.setCountOfAttemptsToEnterTheAccount(0);
            return true;
        } else {
            increaseCountOfAttemptsToEnterTheAccount(user);
            if (user.getCountOfAttemptsToEnterTheAccount() == 3) {
                this.blockUser(user);
            }
            return false;
        }
    }

    public void resetLoginAttempts(User user) {
        user.setCountOfAttemptsToEnterTheAccount(0);
    }

    public void blockUser(User user) {
        user.setBlocked(true);
    }

    public void increaseCountOfAttemptsToEnterTheAccount(User user) {
        int count = (user.getCountOfAttemptsToEnterTheAccount());
        count++;
        user.setCountOfAttemptsToEnterTheAccount(count);
    }
}