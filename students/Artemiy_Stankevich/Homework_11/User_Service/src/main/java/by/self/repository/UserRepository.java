package by.self.repository;

import by.self.bean.User;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {

    private Map<String, User> listUsers = new HashMap<>();

    public Map<String, User> getListUsers() {
        return listUsers;
    }
    public int save(User user) throws SQLException {
        getListUsers().put(user.getId(), user);
        return 0;
    }
}
