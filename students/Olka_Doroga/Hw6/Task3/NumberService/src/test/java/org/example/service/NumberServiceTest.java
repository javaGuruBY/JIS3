package org.example.service;

import org.junit.jupiter.api.Test;

import javax.xml.stream.FactoryConfigurationError;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {

    @Test
    void rangeSum() {
      NumberService numberService = new NumberService();
      int expected = 25;
      int actual = numberService.rangeSum(3, 7);
      assertEquals(expected, actual, "s>f");
    }

    @Test
    void rangeSum2() {
        NumberService numberService = new NumberService();
        int expected = 9;
        int actual = numberService.rangeSum(4,2);
        assertEquals(expected, actual, "s<f");
    }

    @Test
    void rangeEvenCount() {
        NumberService numberService = new NumberService();
        int expected = 4;
        int actual = numberService.rangeEvenCount(2, 9);
        assertEquals(expected, actual, "s>f");
    }

    @Test
    void rangeEvenCount2() {
        NumberService numberService = new NumberService();
        int expected = 2;
        int actual = numberService.rangeEvenCount(11, 7);
        assertEquals(expected, actual, "s>f");
    }
}