package by.bariloegor.service;

import by.bariloegor.bean.User;
import by.bariloegor.exeption.UserValidationException;

public class UserValidationService {
    public static final int NAME_MIN_LENGTH = 3;
    public static final int NAME_MAX_LENGTH = 12;
    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 120;

    public User createUser(String firstName, String secondName, int age){
        if(isDataEnteredCorrectly(firstName, secondName, age)){
            return new User(firstName,secondName,age);
        }
        throw new UserValidationException("You should enter correctly data.");
    }

    public boolean isDataEnteredCorrectly(String firstName, String secondName, int age) {
        return isNameEnteredCorrectly(firstName, secondName) && isAgeEnteredCorrectly(age);
    }

    public boolean isAgeEnteredCorrectly(int age) {
        if(age >= MIN_AGE && age <= MAX_AGE){
            return true;
        }
        else throw new UserValidationException("Age should be >=0 and <=120.");
    }

    public boolean isNameEnteredCorrectly(String firstName, String secondName) {
        if (secondName.length() >= NAME_MIN_LENGTH && secondName.length() <= NAME_MAX_LENGTH
                && firstName.length() >= NAME_MIN_LENGTH && firstName.length() <= NAME_MAX_LENGTH) {
            return true;
        }
        throw new UserValidationException("First name and last name length should be >= 3 and <= 12.");
    }
}
