package by.jrr.palindrom.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromServiceTest {
    PalindromService palindromService = new PalindromService();
    @Test
    void isPalindromeTest() {
        String text = "LEV!,,,el";
        boolean expected = true;
        boolean actual = palindromService.isPalindrome(text);
        assertEquals(expected, actual, "[ERROR]");
    }
}