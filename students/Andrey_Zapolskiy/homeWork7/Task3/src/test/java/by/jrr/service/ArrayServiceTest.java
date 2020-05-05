package by.jrr.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {

    ArrayService arrayService;
    @BeforeEach
    public void setUp(){
        arrayService = new ArrayService();
    }

    @Test
    void create() {
        ArrayService arrayService = new ArrayService();
        int size = 2;
        String expected = Arrays.toString(new int[size]);
        String actual = Arrays.toString(arrayService.create(size));

        assertEquals(expected, actual);
    }

    @Test
    void Sum() {
        String testMessage = "Should return a sum of elements in array";
        int[] array = {1, 2, 3, 4, 5};
        int expected = 15;
        int actual = arrayService.sum(array);
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void avg() {
        String testMessage = "Should return an average sum of elements in array";
        int[] array = {1, 2, 3, 4, 5};
        double expected = 3.0;
        double actual = arrayService.avg(array);
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void swap() {
        String testMessage = "Should return a reversed array";
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        arrayService.swap(array);
        assertEquals(Arrays.toString(expected), Arrays.toString(array), testMessage);
    }
}