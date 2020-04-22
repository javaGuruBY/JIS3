package by.mmkle.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {
    ArrayService service;

    @BeforeEach
    public void setUp(){
        service = new ArrayService();
    }

    @Test
    void create() {
        String testMessage = "Should create empty array";
        int size = 5;
        String expected = Arrays.toString(new int[size]);
        String actual = Arrays.toString(service.create(size));
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void sum() {
        String testMessage = "Should sum array";
        int[] array = {1, 2, 3, 4, 5};
        int expected = 15;
        int actual = service.sum(array);
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void avg() {
        String testMessage = "Should avg array";
        int[] array = {1, 2, 3, 4, 5};
        double expected = 3.0;
        double actual = service.avg(array);
        assertEquals(expected, actual, 0, testMessage);
    }

    @Test
    void sort() {
        String testMessage = "Should sort array";
        int[] array = {3, 5, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        service.sort(array);
        int[] actual = array;
        assertEquals(Arrays.toString(expected), Arrays.toString(actual), testMessage);
    }

    @Test
    void swap() {
        String testMessage = "Should reverse array";
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        service.swap(array);
        int[] actual = array;
        assertEquals(Arrays.toString(expected), Arrays.toString(actual), testMessage);
    }
}