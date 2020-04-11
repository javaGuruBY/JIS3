package by.jrr.service;

import by.jrr.bean.User;
import by.jrr.repository.UserRepository;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void findUserByNameTest() {

        User expectedUser = new User("Vasyatka", 34);
        UserRepository.userList.add(expectedUser);
        UserService userService = new UserService();
        String userName = "Vasyatka";

        User actualUser = userService.findUserByName(userName);

        assertEquals(expectedUser, actualUser, "indUserByName should return user Vasyatka");
    }
}
