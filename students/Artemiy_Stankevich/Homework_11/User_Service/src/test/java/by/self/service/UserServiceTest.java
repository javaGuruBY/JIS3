package by.self.service;

import by.self.bean.User;
import by.self.repository.MockUserRepository;
import by.self.repository.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    User user;
    UserService userService;

    @Mock
    MockUserRepository mock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        userService = new UserService(mock);
        user = new User("123", "Art", 25);
    }

    @Test
    void addUserTest() throws SQLException {
        Mockito.when(mock.save(user)).thenReturn(1);
        boolean actual = userService.addUser(user);
        Mockito.verify(mock).save(user);
        assertTrue(actual, "should be true");
    }
}