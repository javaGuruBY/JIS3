package by.jrr.service;

import by.jrr.bean.SingComparator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingComparatorServiceTest {
    SingComparator singComparator;
    SingComparatorService singComparatorService;
    @BeforeEach
    void init () {
        singComparator = new SingComparator();
        singComparatorService = new SingComparatorService();
    }

    @Test
    void compareIsPositiveNumTest() {
        singComparator.setNumber(10);
        String expected = "[INFO] Number is positive";
        String actual = singComparatorService.compare(singComparator);
        assertEquals(expected, actual, "compareIsPositiveNumTest should return " +
                "[INFO] Number is positive");
    }
    @Test
    void compareIsNegativeNumTest() {
        singComparator.setNumber(-66);
        String expected = "[INFO] number is negative";
        String actual = singComparatorService.compare(singComparator);
        assertEquals(expected, actual, "compareIsPositiveNumTest should return " +
                "[INFO] number is negative");
    }
    @Test
    void compareIsEqualsToZeroNumTest() {
        singComparator.setNumber(-0);
        String expected = "[INFO] Number is equal to zero";
        String actual = singComparatorService.compare(singComparator);
        assertEquals(expected, actual, "compareIsPositiveNumTest should return " +
                "[INFO] Number is equal to zero");
    }

}