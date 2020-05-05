package by.mmkle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CopyServiceTest {
    private CopyService service;

    @BeforeEach
    public void setUp(){
        service = new CopyService();
    }

    @Test
    void copyInRange() {
        String testMessage = "Should return new array with elements in range";
        int[] leftBound = {2, 4};
        int[] rightBound = {4, 5};
        int[][] array = {
                {1, 2, 3, 4, 5},
                {1, 2, 3}
        };
        int[][] expected = {
                {2, 3, 4},
                {}
        };

        for (int i = 0; i < expected.length; i++){
            int[] actual = service.copyInRange(array[i], leftBound[i], rightBound[i]);
            assertEquals(Arrays.toString(expected[i]), Arrays.toString(actual), testMessage);
        }

    }
}