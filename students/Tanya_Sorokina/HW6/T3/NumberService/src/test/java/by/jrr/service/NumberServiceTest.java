package by.jrr.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {

    @Test
    void rangeSumTest() {
        NumberService numberService = new NumberService();
        int expected = 35;
        int actual = numberService.rangeSum(2, 8);
        assertEquals(expected, actual, "ERROR");
        System.out.println("rangeSumTest has passed");
    }

    @Test
    void rangeEvenCount() {
        NumberService numberService = new NumberService();
        int expected = 35;
        int actual = numberService.rangeEvenCount(2, 8);
        assertEquals(expected, actual, "ERROR");
        System.out.println("rangeSumTest has passed");
    }
}