package by.bariloegor.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome = new Palindrome();

    @Test
    public void isPalindromeTest() {
        boolean[] expected = {true, false};
        String[] strings = {"leV=,'el", "qqqqqwwwwwwwwee"};
        for(int i = 0; i < expected.length; i++){
            boolean actual = palindrome.isPalindrome(strings[i]);
            assertEquals("Should return is string palindrome.", expected[i], actual);
        }
    }

    @Test
    public void swapTest(){
        char[][] expected = {{'v','c','x','s'},{'y','a','w','2'}};
        char[][] arrays = {{'s','x','c','v'},{'2','w','a','y'}};
        for(int i = 0; i < expected.length; i++){
            char[] actual = palindrome.swap(arrays[i]);
            assertArrayEquals("Should swap char[].", expected[i], actual);
        }
    }
}