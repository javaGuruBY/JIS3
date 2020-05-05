package by.jrr.service;

import by.jrr.bean.Sign;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignComparatorTest {

    @Test
    void compareNumberPositive() {
        String expectedResult = "Number is positive";
        Sign number = new Sign();
        SignComparator signComparator = new SignComparator();
        number.setNumber(3);
        String actualResult = signComparator.compare(number);

        assertEquals(expectedResult, actualResult, "Number positive");

    }

    @Test
    void testCompareNumberNegative() {
        String expectedResult = "Number is negative";
        Sign number = new Sign();
        SignComparator signComparator = new SignComparator();
        number.setNumber(-2);
        String actualResult = signComparator.compare(number);

        assertEquals(expectedResult, actualResult, "Number negative");
    }

    @Test
    void testCompare1NumberEqualToZero() {
        String expectedResult = "Number is equal to zero";
        Sign number = new Sign();
        SignComparator signComparator = new SignComparator();
        number.setNumber(0);
        String actualResult = signComparator.compare(number);

        assertEquals(expectedResult, actualResult, "Number is equal to zero");
    }
}