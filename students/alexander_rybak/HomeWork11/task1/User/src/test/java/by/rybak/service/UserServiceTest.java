package by.rybak.service;

import by.rybak.bean.User;
import by.rybak.dao.UserDao;
import by.rybak.repository.MockUserRepository;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UserServiceTest {
    User user;
    MockUserRepository mockUserRepository;
    UserService service;

    @Mock
    UserDao userDao;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        user = new User("23", "Alex", 19);
        mockUserRepository = new MockUserRepository();
        service = new UserService(userDao, mockUserRepository);
    }

    @Test
    void addUserShouldAddUserToRepository() throws SQLException {
        when(userDao.create(user)).thenReturn(1);
        boolean actual = service.addUser(user);
        verify(userDao).create(user);
        assertTrue(actual);
    }
    @Test
    void MockTriggeredShouldReturnTrue() throws SQLException {
        when(userDao.create(user)).thenReturn(1);
        boolean actual = service.addUser(user);
        boolean result = mockUserRepository.isMockTriggered();
        verify(userDao).create(user);
        assertTrue(result);
    }
}