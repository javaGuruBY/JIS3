package by.jrr.numberService.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {

    @Test
    void rangeSum() {
        NumberService numberService = new NumberService();
        int expected = 15;
        int actual = numberService.rangeSum(5, 1);
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void rangeEvenCount() {
        NumberService numberService = new NumberService();
        int expected = 3;
        int actual = numberService.rangeEvenCount(6,2);
        assertEquals(expected, actual, "[ERROR]");
    }
}