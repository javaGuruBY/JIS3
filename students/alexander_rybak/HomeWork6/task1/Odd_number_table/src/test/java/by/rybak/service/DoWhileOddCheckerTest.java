package by.rybak.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoWhileOddCheckerTest {
    DoWhileOddChecker checker;

    @BeforeEach
    public void setUp(){
        checker = new DoWhileOddChecker();
    }

    @Test
    void oddNumberOutput() {
        String[] expected = {"[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49]",
        "[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49]",
        "[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51]",
        "[1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51]"};
        String[] actual = new String[expected.length];
        actual[0] = checker.oddNumberOutput(0,50);
        actual[1] = checker.oddNumberOutput(1,50);
        actual[2] = checker.oddNumberOutput(0,51);
        actual[3] = checker.oddNumberOutput(1,51);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i], "Should return true String!");
        }
    }

    @Test
    void isEven() {
        boolean[] expected = {false, true};
        boolean[] actual = new boolean[expected.length];
        actual[0] = checker.isEven(5);
        actual[1] = checker.isEven(6);
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i], "Should return true comparison!");
        }
    }
}