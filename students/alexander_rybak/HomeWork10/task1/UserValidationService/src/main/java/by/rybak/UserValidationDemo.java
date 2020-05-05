package by.rybak;

import by.rybak.bean.User;
import by.rybak.service.UserValidationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserValidationDemo {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(UserValidationDemo.class);
        
        User user = new User("Alexander", "Rybak", 19);
        UserValidationService service = new UserValidationService();

        log.info(String.valueOf(service.validate(user)));
    }
}
