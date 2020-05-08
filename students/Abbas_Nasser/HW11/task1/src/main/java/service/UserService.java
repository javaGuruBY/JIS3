package service;

import by.abs.bean.User;
import dao.UserDao;


import java.sql.SQLException;

import static repository.UserRepository.users;


public class UserService {



    UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean addUser(User user) throws SQLException{

        if (userDao.update(user) == 1){
            users.put(user.getName(), user.getId());
            return true;
        }else {
            throw new SQLException();
    }
}
}
