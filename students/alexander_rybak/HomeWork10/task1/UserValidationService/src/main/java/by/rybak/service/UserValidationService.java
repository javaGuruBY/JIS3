package by.rybak.service;

import by.rybak.bean.User;
import by.rybak.exception.UserValidationException;

public class UserValidationService {

    public boolean validate(User user) {
        return checkUserFirstName(user) && checkUserSecondName(user) && checkUserAge(user);
    }

    public boolean checkUserFirstName(User user) {
        int length = user.getFirstName().length();
        boolean result = (length >= 3 && length <= 15);
        if(!result){
            throw new UserValidationException("Length of First name isn't right");
        }
        return result;
    }

    public boolean checkUserSecondName(User user) {
            int length = user.getSecondName().length();
            boolean result = (length >= 3 && length <= 15);
            if(!result){
                throw new UserValidationException("Length of Second name isn't right");
            }
            return result;
    }

    public boolean checkUserAge(User user) {
        boolean result = user.getAge() >=0 && user.getAge() <= 120;
        if(!result){
            throw new UserValidationException("Age isn't right");
        }
        return result;
    }
}
