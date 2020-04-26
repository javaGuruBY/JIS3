package by.bariloegor.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CopyTest {
    private Copy copy = new Copy();

    @Test
    public void copyInRange() {
        int[][] expected = {{4,5,6,7,8}, {12,13,14,15}};
        int[][] arrays = {{1,2,3,4,5,6,7,8,9,10}, {10,11,12,13,14,15,16,17,18}};
        int[] leftBounds = {3,2};
        int[] rightBounds = {7,5};
        for(int i = 0; i < expected.length; i++){
            int[] actual = copy.copyInRange(arrays[i], leftBounds[i], rightBounds[i]);
            assertArrayEquals("Should copy in range.", expected[i], actual);
        }
    }
}