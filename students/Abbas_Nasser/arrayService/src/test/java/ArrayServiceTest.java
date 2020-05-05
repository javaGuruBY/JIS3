import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {

    ArrayService service;

    @BeforeEach
    void setUp() {
        service = new ArrayService();
    }

    @Test
    void create() {
        String testMessage = "must return an empty array ";
        int size = 7;
        String expected = Arrays.toString(new int[size]);
        String actual = Arrays.toString((service.create(size)));
        assertEquals(expected, actual, testMessage);
    }



    @Test
    void sum() {
        String testMessage = "must calculate the sum of numbers in the array ";
        int []array = {12, 21, 13, 31, 14, 41, 15};
        int expected = 147;
        int actual = service.sum(array);
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void avg() {
        String testMessage = "must calculate the average of numbers in the array ";
        int []array = {12, 21, 13, 31, 14, 41, 15};
        double expected = 21.0;
        double actual = service.avg(array);
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void sort() {
        String testMessage = "must sort the numbers in the array ";
        int []array = {12, 21, 13, 31, 14, 41, 15};
        int [] expected = {12, 13, 14, 15, 21, 31, 41};
        service.sort(array);
        int [] actual = array;
        assertEquals(Arrays.toString(expected), Arrays.toString(actual),   testMessage);
    }

    @Test
    void swap() {
        String testMessage = "must reverse the numbers in the array ";
        int [] expected = {41, 31, 21, 15, 14, 13, 12};
        int [] array  = {12, 13, 14, 15, 21, 31, 41};
        service.swap(array);
        int [] actual = array;
        assertEquals(Arrays.toString(expected), Arrays.toString(actual),   testMessage);
    }
}