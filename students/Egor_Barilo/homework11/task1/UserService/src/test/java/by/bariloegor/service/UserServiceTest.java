package by.bariloegor.service;

import by.bariloegor.bean.User;
import by.bariloegor.repository.MockUserRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class UserServiceTest {
    private UserService userService;
    private MockUserRepository mockUserRepository;

    @Before
    public void setUp(){
        userService = new UserService();
        mockUserRepository = new MockUserRepository();
    }

    @Test
    public void addUser() {
        userService.addUser(mockUserRepository, Mockito.any(User.class));
        boolean actual = mockUserRepository.isMockTriggered();
        assertTrue("Should add user.", actual);
        mockUserRepository.setMockTriggered(false);
    }
}