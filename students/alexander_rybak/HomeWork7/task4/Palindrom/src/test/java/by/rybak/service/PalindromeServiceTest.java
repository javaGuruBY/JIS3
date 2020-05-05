package by.rybak.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeServiceTest {
    PalindromeService service;

    @BeforeEach
    void setUp() {
        service = new PalindromeService();
    }

    @Test
    void isPalindrome() {
        String text = "Leve,.l";
        boolean actual = service.isPalindrome(text);

        String text1 = "Level";
        boolean actual1 = service.isPalindrome(text1);

        String text2 = "Levhgjel";
        boolean actual2 = service.isPalindrome(text2);

        assertTrue(actual);
        assertTrue(actual1);
        assertFalse(actual2);
    }
}