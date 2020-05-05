package by.bariloegor;

import by.bariloegor.bean.User;
import by.bariloegor.service.UserValidationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);
        UserValidationService userValidationService = new UserValidationService();
        User firstUser = userValidationService.createUser("Egor", "Barilo", 23);
        log.info(firstUser.toString());
    }
}
