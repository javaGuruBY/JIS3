package by.jrr.service;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();

    @Test
    void createTest() {
        int size = 15;
        String expected = Arrays.toString(new int[size]);
        String actual = Arrays.toString(arrayService.create(size));
        assertEquals(expected, actual, "Error");
        System.out.println("createTest has passed");
    }

    @Test
    void sumTest() {
        int[] array = {3,6,9,1};
        int expected =19;
        int actual = arrayService.sum(array);
        assertEquals(expected, actual, "ERROR");
        System.out.println("sumTest has passed");
    }

    @Test
    void avgTest() {
        int[] array = {2, 4, 6};
        double expected = 4;
        double actual = arrayService.avg(array);
        assertEquals(expected, actual,"Error");
        System.out.println("avgTest has passed");
    }

    @Test
    void sortTest() {
        int[] array = {1,8,5};
        arrayService.sort(array);
        String expected = "[1, 5, 8]";
        String actual = Arrays.toString(array);
        assertEquals(expected, actual, "ERROR");
        System.out.println("sortTest has passed");
    }

    @Test
    void swapTest() {
        int[] array = {1,2,8,4,7};
        arrayService.swap(array);
        String expected = "[7, 4, 8, 2, 1]";
        String actual = Arrays.toString(array);
        assertEquals(expected, actual, "ERROR");
        System.out.println("swapTest has passed");
    }
}