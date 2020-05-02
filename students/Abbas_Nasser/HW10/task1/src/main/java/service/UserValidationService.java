package service;

import by.abs.bean.User;
import by.abs.bean.exceptions.UserValidationException;

public class UserValidationService {

    public  boolean  validate ( User user ) {
        return checkUserFirstName(user.getFirstName()) &&
        checkUserLastName(user.getLastName()) &&
        checkUserAge(user.getAge());
    }

    public boolean checkUserFirstName(String firstName){
        if(firstName.length() >= 3 && firstName.length() <=15){
            return true;
        }
        throw new UserValidationException("first name must be between 3 and 15 characters");
    }

    public boolean checkUserLastName(String lastName){
        if(lastName.length() >= 3 && lastName.length() <=15){
            return true;
        }
        throw new UserValidationException("last name must be between 3 and 15 characters");
    }

    public boolean checkUserAge(int age){
        if (age >=0 && age <=120){
            return true;
        }
        throw new UserValidationException("invalid age");
    }


}
