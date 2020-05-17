package by.self.service;

import by.self.bean.User;
import by.self.repository.UserRepository;
import java.sql.SQLException;

public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public boolean addUser(User user) throws SQLException {
        if(!userRepository.getListUsers().containsValue(user)) {
            userRepository.save(user);
        } else {
            throw new SQLException("cant add this user");
        }return true;
    }

}
