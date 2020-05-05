package by.mmkle.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeServiceTest {
    private PalindromeService service;

    @BeforeEach
    public void setUp(){
        service = new PalindromeService();
    }
    @Test
    void isPalindrome() {
        String testMessage = "Should return is string palindrome";
        String[] text = {"aba", "abc", "Aba", "a,ba"};
        boolean[] expected = {true, false, true, true};

        for (int i = 0; i < expected.length; i++){
            boolean actual = service.isPalindrome(text[i]);
            assertEquals(expected[i], actual, testMessage);
        }

    }
}