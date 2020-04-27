package by.abs.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CopyServiceTest {
 CopyService service;

    @BeforeEach
    void setUp() {
        service = new CopyService();
    }

    @Test
    void copyInRange() {
        String testMessage = "mst return an array with elements in range";
        int[] leftBound = {8,9};
        int[] rightBound = {9,10};
        int[][] array = {
                { 7, 8, 9, 10, 11},
                {1, 2, 3, 4, 5, 6} };
        int[][] expected = {
                {8, 9},
                {} };

        for (int i = 0; i < expected.length; i++){
            int[] actual = service.copyInRange(array[i], leftBound[i], rightBound[i]);
            assertEquals(Arrays.toString(expected[i]), Arrays.toString(actual), testMessage);
        }

    }
}
