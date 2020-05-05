package by.mmkle.service;

import by.mmkle.bean.User;
import by.mmkle.dao.UserDao;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.SQLException;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserServiceTest {
    private User user;
    private UserService service;

    @Mock
    UserDao userDao;

    @Before
    public void setUp() {
        user = new User(1, "max", 29);
        MockitoAnnotations.initMocks(this);
        service = new UserService(userDao);
    }

    @Test
    public void addUser() throws SQLException {
        when(userDao.update(user)).thenReturn(1);
        boolean actual = service.addUser(user);
        verify(userDao).update(user);
        assertTrue(actual);
    }

    @Test(expected = SQLException.class)
    public void cantAddUser() throws SQLException {
        when(userDao.update(user)).thenReturn(0);
        boolean actual = service.addUser(user);
        verify(userDao).update(user);
        assertFalse(actual);
    }
}