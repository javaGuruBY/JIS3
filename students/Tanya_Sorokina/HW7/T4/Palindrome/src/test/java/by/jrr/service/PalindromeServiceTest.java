package by.jrr.service;
import by.jrr.service.PalindromeService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeServiceTest {

    @Test
    void isPalindromeTest() {
        PalindromeService palindromeService = new PalindromeService();
        String text = "А роза упала на лапу Азора";
        boolean expected = true;
        boolean actual = palindromeService.isPalindrome(text);
        assertEquals(expected, actual, "Error");
        System.out.println("isPalindromeTest hss passed");
    }
}