package by.jrr.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CopyServiceTest {
    private CopyInRangeService copyInRangeService;

    @BeforeEach
    public void setUp(){
        copyInRangeService = new CopyInRangeService();
    }

    @Test
    void copyInRange() {
        String testMessage = "Should return new array with elements in range";
        int[] leftBound = {1, 4, 30};
        int[] rightBound = {3, 5, 75};
        int[][] array = {
                {1, 2, 3, 4, 5},
                {1, 2, 3},
                {40, 75, 23, 36, 87, 95, 54, 11, 62}
        };
        int[][] expected = {
                {1, 2, 3},
                {},
                {40, 75, 36, 54, 62}
        };

        for (int i = 0; i < expected.length; i++){
            int[] actual = copyInRangeService.copyInRange(array[i], leftBound[i], rightBound[i]);
            assertEquals(Arrays.toString(expected[i]), Arrays.toString(actual), testMessage);
        }

    }
}