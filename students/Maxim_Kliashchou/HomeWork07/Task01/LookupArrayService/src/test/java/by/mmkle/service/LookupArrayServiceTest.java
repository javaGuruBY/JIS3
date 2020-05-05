package by.mmkle.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LookupArrayServiceTest {
    LookupArrayService service = new LookupArrayService();

    @BeforeEach
    public void setUp(){
        service = new LookupArrayService();
    }

    @Test
    void findMax() {
        String testMessage = "Should find max element";
        int[] expected = {4, 5, 0};
        int[][] array = {
                {1, 2, 3, 4},
                {4, 3, 5, 1},
                {}
        };
        for (int i = 0; i < expected.length; i++){
            int actual = service.findMax(array[i]);
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void findMin() {
        String testMessage = "Should find min element";
        int[] expected = {1, 2, 0};
        int[][] array = {
                {1, 2, 3, 4},
                {4, 3, 5, 2},
                {}
        };
        for (int i = 0; i < expected.length; i++){
            int actual = service.findMin(array[i]);
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void indexOfMax() {
        String testMessage = "Should find index of max element";
        int[] expected = {3, 2, -1};
        int[][] array = {
                {1, 2, 3, 4},
                {4, 3, 5, 2},
                {}
        };
        for (int i = 0; i < expected.length; i++){
            int actual = service.indexOfMax(array[i]);
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void indexOfMin() {
        String testMessage = "Should find index of min element";
        int[] expected = {0, 3, -1};
        int[][] array = {
                {1, 2, 3, 4},
                {4, 3, 5, 2},
                {}
        };
        for (int i = 0; i < expected.length; i++){
            int actual = service.indexOfMin(array[i]);
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void indexOf() {
        String testMessage = "Should find index of element";
        int[] value = {2, 4, 5};
        int[] expected = {1, 0, -1};
        int[][] array = {
                {1, 2, 3, 4},
                {4, 3, 5, 2},
                {}
        };
        for (int i = 0; i < expected.length; i++){
            int actual = service.indexOf(array[i], value[i]);
            assertEquals(expected[i], actual, testMessage);
        }
    }
}