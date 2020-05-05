package by.jrr.arrayServiceSort.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceSortTest {
    ArrayServiceSort arrayService = new ArrayServiceSort();

    @Test
    void createTest() {
        int size = 10;
        String expected = Arrays.toString(new int[size]);
        String actual = Arrays.toString(arrayService.create(size));
        assertEquals(expected, actual, "[ERROR: invalid] \n" +
                "the number of cells in size does not match the number in the created array");
    }

    @Test
    void sumTest() {
        int expected = 10;
        int actual = arrayService.sum(new int[]{1,2,3,4});
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void avgTest() {
        double expected = 4.5;
        double actual = arrayService.avg(new int[] {2,3,4,5,6,7});
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void avgTestIfArrayIsNull() {
        double expected = 0;
        double actual = arrayService.avg(new int[5]);
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void sortTest() {
        int [] arrayTestingForSort = {4,5,6,9,1,2,3,7,8};
        String  expected = "[1, 2, 3, 4, 5, 6, 7, 8, 9]";
        arrayService.sort(arrayTestingForSort);
        String actual = Arrays.toString(arrayTestingForSort);
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void swapTest() {
        int [] arrayTestingForSwap = {4,5,6,9,1,2,3,7,8};
        String expected = "[8, 7, 3, 2, 1, 9, 6, 5, 4]";
        arrayService.swap(arrayTestingForSwap);
        String actual = Arrays.toString(arrayTestingForSwap);
        assertEquals(expected, actual, "[ERROR]");
    }

}