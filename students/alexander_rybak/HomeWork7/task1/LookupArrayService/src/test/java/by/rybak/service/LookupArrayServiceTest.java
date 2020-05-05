package by.rybak.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LookupArrayServiceTest {
    ArrayList<Integer> array;
    ArrayList<Integer> array1;
    LookupArrayService service = new LookupArrayService();

    @BeforeEach
    public void setUp(){
        array = new ArrayList<>();
        array.add(1);
        array.add(53);
        array.add(-32);
        array.add(23);
        array1 = new ArrayList<>(0);
        service = new LookupArrayService();
    }

    @Test
    void findMax() {
        int[] expected = {53,0};
        int[] actual = new int[2];
        actual[0] = service.findMax(array);
        actual[1] = service.findMax(array1);

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    void findMin() {
        int[] expected = {-32,0};
        int[] actual = new int[2];
        actual[0] = service.findMin(array);
        actual[1] = service.findMin(array1);

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    void indexOfMax() {
        int[] expected = {1,-1};
        int[] actual = new int[2];
        actual[0] = service.indexOfMax(array);
        actual[1] = service.indexOfMax(array1);

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    void indexOfMin() {
        int[] expected = {2,-1};
        int[] actual = new int[2];
        actual[0] = service.indexOfMin(array);
        actual[1] = service.indexOfMin(array1);

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    void indexOf() {
        int[] expected = {3,-1};
        int[] actual = new int[2];
        actual[0] = service.indexOf(array,23);
        actual[1] = service.indexOf(array1,23);

        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }
}