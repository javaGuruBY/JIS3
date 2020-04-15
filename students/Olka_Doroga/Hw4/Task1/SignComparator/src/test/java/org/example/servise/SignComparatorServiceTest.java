package org.example.servise;

import org.example.bean.SignComparator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignComparatorServiceTest {

    @Test
    void NumberTestPositive(){
        String expectedResult = "Number is positive";
        SignComparator signComparator = new SignComparator(4);
        SignComparatorService actualResult = new SignComparatorService();

        assertEquals(expectedResult,  actualResult.compare(signComparator), "111");
    }

    @Test
    void NumberTestNegative(){
        String expectedResult = "Number is negative";
        SignComparator signComparator = new SignComparator(-2);
        SignComparatorService actualResult = new SignComparatorService();

        assertEquals(expectedResult,  actualResult.compare(signComparator), "222");
    }


    @Test
    void NumberTestEqualToZero(){
        String expectedResult = "Number is equal to zero";
        SignComparator signComparator = new SignComparator(0);
        SignComparatorService actualResult = new SignComparatorService();

        assertEquals(expectedResult,  actualResult.compare(signComparator), "333");
    }
}


