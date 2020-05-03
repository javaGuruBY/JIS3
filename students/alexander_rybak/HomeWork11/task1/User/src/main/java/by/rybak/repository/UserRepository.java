package by.rybak.repository;

import by.rybak.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    Map<String, User> users = new HashMap<>();
    static Logger log = LoggerFactory.getLogger(UserRepository.class);

    public void save(User user){
        if(user != null){
            users.put(user.getId(), user);
        }else{
           log.warn("Can't save user!"); 
        }
    }
}
