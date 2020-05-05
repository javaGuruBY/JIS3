package by.mmkle.service;

import by.mmkle.dao.UserDao;
import by.mmkle.bean.User;

import java.sql.SQLException;

import static by.mmkle.repository.UserRepository.*;

public class UserService {
    UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean addUser(User user) throws SQLException {
        if (userDao.update(user) == 1) {
            users.put(user.getId(), user.getName());
            return true;
        } else {
            throw new SQLException();
        }
    }
}
