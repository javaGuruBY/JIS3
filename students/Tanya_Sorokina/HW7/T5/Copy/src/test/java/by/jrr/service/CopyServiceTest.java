package by.jrr.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CopyServiceTest {

    @Test
    void copyInRangeTest() {
        CopyService copyService = new CopyService();
        int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        String expected = "[2, 3, 4, 5, 6, 7, 8]";
        int [] newCopyArrayTest = copyService.copyInRange(array, 2,8);
        String actual = Arrays.toString(newCopyArrayTest);
        assertEquals(expected, actual, "Error");
        System.out.println("copyInRangeTest has passed");
    }
}