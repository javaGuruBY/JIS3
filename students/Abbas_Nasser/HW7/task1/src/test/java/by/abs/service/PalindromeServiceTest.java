package by.abs.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeServiceTest {

    private PalindromeService service;

    @BeforeEach
    void setUp() {
        service = new PalindromeService();
    }

    @Test
    void isPalindrome() {
        String testMessage = "must return a true palindrome";
        String[] text = {"mad.am", "nurses run", "LEvel", "do stuff"};
        boolean[] expected = {true, true, true, false};

        for (int i = 0;i < expected.length;i++){
            boolean actual = service.isPalindrome(text[i]);
            assertEquals(expected[i], actual, testMessage);
        }
     }
}