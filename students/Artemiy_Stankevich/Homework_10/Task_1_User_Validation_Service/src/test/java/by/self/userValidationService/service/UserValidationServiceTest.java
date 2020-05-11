package by.self.userValidationService.service;

import by.self.userValidationService.bean.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationServiceTest {
    UserValidationService service;
    User userNormal, userBizzare1, getUserBizzare2;

    @BeforeEach
    void setUp() {
        service = new UserValidationService();
        userNormal = new User("Ticon", "Nescor", 25);
        userBizzare1 = new User("WatafakerMazafaker", "MazafakerWatafaker", 200);
        getUserBizzare2 = new User("Do", "ha", -5);
    }

    @Test
    void isUserAgePermissibleTest() {
        boolean[] expected = {true, false, false};
        int[] ageTest = {userNormal.getAge(), userBizzare1.getAge(),getUserBizzare2.getAge()};
        for (int i = 0; i < expected.length; i++) {
            boolean actual = service.isUserAgePermissible(ageTest[i]);
            assertEquals(expected[i], actual, "[ERROR]");
        }

    }

    @Test
    void isMinAndMaxLengthNameUserPermissibleTest() {
        boolean[] expected = {true, false, false};
        String[] names = {userNormal.getFirstName(), userBizzare1.getFirstName(), getUserBizzare2.getFirstName()};
        for (int i = 0; i < expected.length; i++) {
            boolean actual = service.isMinAndMaxLengthNameUserPermissible(names[i]);
            assertEquals(expected[i], actual, "epected: " + expected[i] + ", but was actual:" +
                    " " + actual);
        }
    }

    @Test
    void isMinAndMaxLengthSurnameUserPermissibleTest() {
        boolean[] expected = {true, false, false};
        String[] lastNames = {userNormal.getLastName(), userBizzare1.getLastName(), getUserBizzare2.getLastName()};
        for (int i = 0; i < expected.length; i++) {
            boolean actual = service.isMinAndMaxLengthNameUserPermissible(lastNames[i]);
            assertEquals(expected[i], actual, "epected: " + expected[i] + ", but was actual:" +
                    " " + actual);
        }
    }
}