package by.bariloegor.service;

import by.bariloegor.bean.User;
import by.bariloegor.repository.UserRepository;

public class UserService {
    public void addUser(UserRepository userRepository, User user){
        if(!UserRepository.users.containsValue(user)) {
            userRepository.save(user);
        }
    }
}
