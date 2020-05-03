package by.rybak.service;

import by.rybak.bean.User;
import by.rybak.dao.UserDao;
import by.rybak.exceptions.MyException;
import by.rybak.repository.UserRepository;

import java.sql.SQLException;

public class UserService {
    UserDao userDao;
    UserRepository userRepository;

    public UserService(UserDao userDao, UserRepository userRepository) {
        this.userDao = userDao;
        this.userRepository = userRepository;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean addUser(User user) throws MyException, SQLException {
        if (userDao.create(user) == 1) {
            userRepository.save(user);
            return true;
        } else {
            throw new MyException("can't add user...");
        }
       
    }
}
