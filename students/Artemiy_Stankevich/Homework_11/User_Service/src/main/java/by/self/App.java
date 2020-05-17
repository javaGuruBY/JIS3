package by.self;

import by.self.bean.User;
import by.self.repository.UserRepository;
import by.self.service.UserService;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        UserRepository userRepository = new UserRepository();
        User user = new User("123", "Ticon", 25);
        UserService service = new UserService(userRepository);

        try {
            service.addUser(user);
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        userRepository.getListUsers().forEach((a,b) -> System.out.println(a + ", " + b));
    }
}
