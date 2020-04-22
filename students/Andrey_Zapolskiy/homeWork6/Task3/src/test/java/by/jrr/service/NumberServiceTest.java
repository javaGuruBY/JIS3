package by.jrr.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {

    @Test
    void rangeSum() {
        int expectedSum = 6;
        NumberService numberService = new NumberService();
        int actualSum = numberService.rangeSum(3,1);

        assertEquals(expectedSum, actualSum, "If finish < than start");
    }
    @Test
    void rangeSum2() {
        int expectedSum = 6;
        NumberService numberService = new NumberService();
        int actualSum = numberService.rangeSum(1,3);

        assertEquals(expectedSum, actualSum, "If finish > than start");
    }

    @Test
    void rangeEvenCount() {
        int expectedCount = 2;
        NumberService numberService = new NumberService();
        int actualCount = numberService.rangeEvenCount(1,5);

        assertEquals(expectedCount, actualCount, "should count 2 even numbers");
    }

    @Test
    void rangeEvenCount2() {
        int expectedCount = 2;
        NumberService numberService = new NumberService();
        int actualCount = numberService.rangeEvenCount(5,1);

        assertEquals(expectedCount, actualCount, "should count 2 even numbers");
    }
}