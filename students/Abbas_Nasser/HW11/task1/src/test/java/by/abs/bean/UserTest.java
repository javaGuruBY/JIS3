package by.abs.bean;

import dao.UserDao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import service.UserService;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

class UserTest {
    User user;
    UserService service;

    @Mock
    UserDao userDao;


    @BeforeEach
    void setUp() {
    user = new User();
    MockitoAnnotations.initMocks(this);
    service = new UserService(userDao);

    }

    @Test
    void shouldAddUser() throws SQLException{
    when(userDao.update(user)).thenReturn(1);
    boolean actual = service.addUser(user);
    verify(userDao).update(user);
    assertTrue(actual);
    }

    @Test
    void testName() {
    user.setName("adam");
    String expected = "adam";
    String actual = user.getName();
    assertEquals(expected, actual);
    }

    @Test
    void testAge() {
        user.setAge(2);
        int expected =2;
        int actual = user.getAge();
        assertEquals(expected, actual);
    }


    @Test
    void testId() {
        user.setId(66);
        int expected =66;
        int actual = user.getId();
        assertEquals(expected, actual);
    }

    @Test
    void testEqualsAndHashCode() {
    User user1 = new User("adam" , 2, 66);
    User user2 = new User("adam", 2, 66);
    assertEquals(user1, user2, "these should be equal" );

    int oneCode = user1.hashCode();
    assertEquals(oneCode, user2.hashCode(), "hashCodes should be equal");
    assertEquals(oneCode, user1.hashCode(), "hashCodes should not change");
    }




}