package by.mmkle.service;

import by.mmkle.bean.User;
import by.mmkle.exception.UserValidationException;

public class UserValidationService {
    public boolean validation(User user){
        return checkUserFirstName(user.getFirstName())
                && checkUserLastName(user.getLastName())
                && checkUserAge(user.getAge());
    }

    private boolean checkUserAge(int age) {
        if (age >= 0 && age <= 120){
            return true;
        }
        throw new UserValidationException("Invalid user age");
    }

    private boolean checkUserLastName(String lastName) {
        if (lastName.length() >= 3 && lastName.length() <= 15){
            return true;
        }
        throw new UserValidationException("Invalid user last name");
    }

    private boolean checkUserFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <= 15){
            return true;
        }
        throw new UserValidationException("Invalid user first name");
    }
}
