package by.bariloegor.repository;

import by.bariloegor.bean.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRepositoryTest {
    UserRepository userRepository;

    @Before
    public void setUp(){
        userRepository = new UserRepository();
    }

    @After
    public void tearDown(){
        UserRepository.users.clear();
    }

    @Test
    public void save() {
        User[] users = {new User(1, "Egor", 23),
                new User(2,"Igor", 25)};
        for (User user : users) {
            userRepository.save(user);
            boolean actual = UserRepository.users.containsValue(user);
            assertTrue("Should add user", actual);
        }
    }
}