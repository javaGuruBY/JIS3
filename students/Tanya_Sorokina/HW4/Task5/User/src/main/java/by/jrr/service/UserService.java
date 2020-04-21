package by.jrr.service;
import by.jrr.bean.User;

            
public class UserService {

    public boolean login(User user, String password) throws Exception {
        int countTries = user.getCountLoginAttempts();

        if (user.isInBlocked()){
            System.out.println("User blocked: number of input attempts exceeded 3.");
            return false;
        }

        boolean PasswordValid = user.getPassword() == password;
        if (PasswordValid) {
            user.resetTries();
        } else {
            countTries = countTries -1;
            user.setCountLoginAttempts(countTries);
        }
        if (countTries == 0) {
            user.setInBlocked(true);
        }
        return PasswordValid;

    }

}

