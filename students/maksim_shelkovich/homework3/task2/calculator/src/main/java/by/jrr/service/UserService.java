package by.jrr.service;

import by.jrr.bean.User;
import by.jrr.repository.UserRepository;

public class UserService {

    public void saveUser(User user) {
        UserRepository.userList.add(user);

    }

    public User findUserByName(String userName) {
        for (User oneUser : UserRepository.userList) {
            if (oneUser.getName().equals(userName)) {
                return oneUser;
            }
        }
        return new User();
    }
}
