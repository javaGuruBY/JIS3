package by.bariloegor.service;

import by.bariloegor.bean.User;
import by.bariloegor.exeption.UserValidationException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserValidationServiceTest {
    UserValidationService userValidationService = new UserValidationService();

    @Test
    public void createUserTest() {
        User[] expected = { new User("Egor", "Barilo", 23),
                new User ("Dasha", "Sakel", 24)};
        String[] firstNames = {"Egor", "Dasha"};
        String[] secondNames = {"Barilo", "Sakel"};
        int[] ages = {23, 24};
        for(int i = 0; i < expected.length; i++){
            User actual = userValidationService.createUser(firstNames[i], secondNames[i], ages[i]);
            assertEquals("Should create user.", expected[i], actual);
        }

    }

    @Test(expected = UserValidationException.class)
    public void createUserExceptionTest()  {
        String[] firstNames = {"qq", "Qqq", "Qqq"};
        String[] secondNames = {"Barilo", "ww", "Www"};
        int[] ages = {24, 23, 300};
        for(int i = 0; i < firstNames.length; i++)
            userValidationService.createUser(firstNames[i], secondNames[i], ages[i]);
    }

    @Test
    public void isDataEnteredCorrectlyTest() {
        boolean[] expected= {true, true};
        String[] firstNames = {"Egor", "Igor"};
        String[] secondNames = {"Barilo", "Petrov"};
        int[] ages = {23, 25};
        for(int i = 0; i < expected.length; i++){
            boolean actual = userValidationService.isDataEnteredCorrectly(firstNames[i], secondNames[i], ages[i]);
            assertEquals("Should return is data entered correctly.", expected[i], actual);
        }
    }

    @Test(expected = UserValidationException.class)
    public void isDataEnteredCorrectlyExceptionTest() {
        String[] firstNames = {"qq", "Qqq", "Qqq"};
        String[] secondNames = {"Barilo", "ww", "Www"};
        int[] ages = {24, 23, 300};
        for(int i = 0; i < firstNames.length; i++)
            userValidationService.isDataEnteredCorrectly(firstNames[i], secondNames[i], ages[i]);
    }

    @Test
    public void isAgeEnteredCorrectlyTest() {
        boolean[] expected = {true, true};
        int[] ages = {15, 100};
        for(int i = 0; i < expected.length; i++){
            boolean actual = userValidationService.isAgeEnteredCorrectly(ages[i]);
            assertEquals("Should return is age entered correctly.", expected[i], actual);
        }
    }

    @Test(expected = UserValidationException.class)
    public void isAgeEnteredCorrectlyExceptionTest() {
        int[] ages = {200, -100};
        for (int age : ages) {
            userValidationService.isAgeEnteredCorrectly(age);
        }
    }

    @Test
    public void isNameEnteredCorrectlyTest() {
        boolean[] expected = {true, true};
        String[] firstNames = {"Sasha", "Masha"};
        String[] secondNames = {"Petrov", "Petrova"};
        for(int i = 0; i < expected.length; i++){
            boolean actual = userValidationService.isNameEnteredCorrectly(firstNames[i], secondNames[i]);
            assertEquals("Should return is first name and second name entered correctly.", expected[i], actual);
        }
    }

    @Test(expected = UserValidationException.class)
    public void isNameEnteredCorrectlyExceptionTest() {
        String[] firstNames = {"gg", "Qwe"};
        String[] secondNames = {"Koko", "jj"};
        for(int i = 0; i < firstNames.length; i++)
            userValidationService.isNameEnteredCorrectly(firstNames[i], secondNames[i]);
    }
}