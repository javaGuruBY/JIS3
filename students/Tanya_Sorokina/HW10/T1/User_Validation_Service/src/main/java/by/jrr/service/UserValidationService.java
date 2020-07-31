package by.jrr.service;
import by.jrr.bean.User;
import by.jrr.exception.UserValidationException;
//    Минимальная длина имени / фамилии пользователя - 3 символа;
//            Максимальная длина имени / фамилии пользователя - 15 символов;
//            Допустимый возраст пользователя: от 0 до 120 лет включительно;
//
//            В случае, если данные не проходят одну из проверок, то необходимо
//            выбросить UserValidationException с причиной ошибки.

public class UserValidationService {

    public boolean validate(User user){
        return minMaxLengthUsrFirstName(user.getFirstName()) && minMaxLengthUsrLastName(user.getLastName()) && minMaxLengthUsrAge(user.getAge());
    }

    public boolean minMaxLengthUsrFirstName(String firstName) {
        if (firstName.length() >= 3 && firstName.length() <=15) {
            return true;
        }
        throw new  UserValidationException ("first name must be between 3 and 15 letters");
    }

    public boolean minMaxLengthUsrLastName(String lastName) {
        if (lastName.length() >= 3 && lastName.length() <=15) {
            return true;
        }
        throw new  UserValidationException ("last name must be between 3 and 15 letters");
    }

    public boolean minMaxLengthUsrAge (int age) {
        if (age >=0 && age <=120) {
            return true;
        }
        throw new  UserValidationException ("entered incorrect age");
    }

}
