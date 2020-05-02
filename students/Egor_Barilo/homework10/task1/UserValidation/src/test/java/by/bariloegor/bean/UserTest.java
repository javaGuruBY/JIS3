package by.bariloegor.bean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void getFirstNameTest() {
        User[] users = { new User("Egor", "Barilo", 23),
                new User("Dasha", "Sakel", 24)};
        String[] expected = {"Egor", "Dasha"};
        for(int i = 0; i < expected.length; i++){
            String actual = users[i].getFirstName();
            assertEquals("Should return first name.", expected[i], actual);
        }
    }

    @Test
    public void setFirstNameTest() {
        User[] users = { new User("QWe", "Barilo", 23),
                new User("WER", "Sakel", 24)};
        String[] firstNames = {"Egor", "Dasha"};
        String[] expected = {"Egor", "Dasha"};
        for(int i = 0; i < expected.length; i++){
            users[i].setFirstName(firstNames[i]);
            String actual = users[i].getFirstName();
            assertEquals("Should set first name.", expected[i], actual);
        }
    }

    @Test
    public void getSecondNameTest() {
        User[] users = { new User("Egor", "Barilo", 23),
                new User("Dasha", "Sakel", 24)};
        String[] expected = {"Barilo", "Sakel"};
        for(int i = 0; i < expected.length; i++){
            String actual = users[i].getSecondName();
            assertEquals("Should return second name.", expected[i], actual);
        }
    }

    @Test
    public void setSecondNameTest() {
        User[] users = { new User("Egor", "qwe", 23),
                new User("Dasha", "ter", 24)};
        String[] secondNames = {"Barilo", "Sakel"};
        String[] expected = {"Barilo", "Sakel"};
        for(int i = 0; i < expected.length; i++){
            users[i].setSecondName(secondNames[i]);
            String actual = users[i].getSecondName();
            assertEquals("Should set second name.", expected[i], actual);
        }
    }

    @Test
    public void getAgeTest() {
        User[] users = { new User("Egor", "Barilo", 23),
                new User("Dasha", "Sakel", 24)};
        int[] expected = {23, 24};
        for(int i = 0; i < expected.length; i++){
            int actual = users[i].getAge();
            assertEquals("Should return age.", expected[i], actual);
        }
    }

    @Test
    public void setAgeTest() {
        User[] users = { new User("QWe", "Barilo", 23),
                new User("WER", "Sakel", 24)};
        String[] firstNames = {"Egor", "Dasha"};
        String[] expected = {"Egor", "Dasha"};
        for(int i = 0; i < expected.length; i++){
            users[i].setFirstName(firstNames[i]);
            String actual = users[i].getFirstName();
            assertEquals("Should set first name.", expected[i], actual);
        }
    }

    @Test
    public void testToString() {
        User[] users = { new User("Egor", "Barilo", 23),
                new User("Dasha", "Sakel", 24)};
        String[] expected = { "User{firstName='Egor', secondName='Barilo', age=23}",
                "User{firstName='Dasha', secondName='Sakel', age=24}"};
        for(int i = 0; i < expected.length; i++){
            String actual = users[i].toString();
            assertEquals("Should return user to string.", expected[i], actual);
        }
    }
}