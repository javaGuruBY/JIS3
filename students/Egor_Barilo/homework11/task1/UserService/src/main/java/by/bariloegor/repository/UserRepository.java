package by.bariloegor.repository;

import by.bariloegor.bean.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    public static final Map<Integer, User> users = new HashMap<>();

    public void save(User user){
        users.put(user.getId(), user);
    }
}
