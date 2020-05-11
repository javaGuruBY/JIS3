package by.self.userValidationService;

import by.self.userValidationService.bean.User;
import by.self.userValidationService.exception.UserValidationException;
import by.self.userValidationService.service.UserValidationService;

public class App {
    public static void main(String[] args) throws UserValidationException {
        User user = new User("Artemiy", "Stankevich", 25);
        UserValidationService service = new UserValidationService();
        try {
            service.checkingTheUserForThePermissibleLengthOfTheNameOfTheSurnameAndAge(user);
        }catch (UserValidationException ex) {
            ex.printStackTrace();
        }
    }
}
