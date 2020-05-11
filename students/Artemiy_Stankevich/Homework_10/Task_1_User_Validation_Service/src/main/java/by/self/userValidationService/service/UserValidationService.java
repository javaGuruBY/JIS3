package by.self.userValidationService.service;

import by.self.userValidationService.bean.User;
import by.self.userValidationService.constant.Constant;
import by.self.userValidationService.exception.UserValidationException;

public class UserValidationService {

    public void checkingTheUserForThePermissibleLengthOfTheNameOfTheSurnameAndAge(User user) {
        if(isMinAndMaxLengthNameUserPermissible(user.getFirstName())) {
            System.out.println("User [name] is valid: " + user.getFirstName());
        } else {
            throw new UserValidationException("Min or max length [Name] User less " +
                    "or more than acceptable value. Value should be within 3 and 15 characters");
        } if (isMinAndMaxLengthSurnameUserPermissible(user.getLastName())) {
            System.out.println("User [sureName] is valid: " + user.getLastName());
        } else {
            throw new UserValidationException("Min or max length [sureName] User less " +
                    "or more than acceptable value. Value should be within 3 and 15 characters");
        } if(isUserAgePermissible(user.getAge())) {
            System.out.println("user [age] is valid: " + user.getAge());
        } else {
            throw new UserValidationException("user [age] is not included in the valid value");
        }
    }

    public boolean isUserAgePermissible(int age) {
        return age >= Constant.getMinAge() && age <= Constant.getMaxAge();
    }

    public boolean isMinAndMaxLengthNameUserPermissible (String name) {
        return name.length() >= Constant.getMinUserNameOrSurnameLength() &&
                name.length() <= Constant.getMaxUserNameOrSurnameLength();
    }
    public boolean isMinAndMaxLengthSurnameUserPermissible (String sureName) {
        return sureName.length() >= Constant.getMinUserNameOrSurnameLength() &&
                sureName.length() <= Constant.getMaxUserNameOrSurnameLength();
    }

}
