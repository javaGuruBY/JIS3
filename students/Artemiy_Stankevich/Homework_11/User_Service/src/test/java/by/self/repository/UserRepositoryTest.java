package by.self.repository;

import by.self.bean.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    private UserRepository userRepository;
    private Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);

    @BeforeEach
    void setUp() {
        logger.info("setUp");
        userRepository = new UserRepository();
    }
    @AfterEach
    void setDown() {
        logger.info("setDown");
        userRepository.getListUsers().clear();
    }

    @Test
    void getListUsersTest() {
        logger.info("getListUsersTest");
        User user = new User("15", "Art", 25);
        userRepository.getListUsers().put(user.getId(), user);
        Map<String, User> expected = new HashMap<>();
        expected.put(user.getId(), user);
        Map actual = userRepository.getListUsers();
        assertEquals(expected, actual, "Test should return Map collections");
    }

    @Test()
    void saveTest() throws SQLException {
        logger.info("saveTest");
        User [] users = {new User("15", "Artemiy", 25), new User("16", "Sasha", 26)};
        for (User allUsers: users
             ) {
            userRepository.save(allUsers);
            boolean actual = userRepository.getListUsers().containsValue(allUsers);
            assertTrue(actual, "this user not contained in listUsers");
        }
    }
}