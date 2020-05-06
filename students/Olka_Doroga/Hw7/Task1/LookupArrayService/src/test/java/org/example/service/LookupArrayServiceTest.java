package org.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LookupArrayServiceTest {

    @Test
    void findMax() {
        LookupArrayService service = new LookupArrayService();
        int[] expected = {8, 11, 0};
        int[][] array = {{7, 5, 8, 2}, {1, 11, 3}, {}};
        for (int i = 0; i < expected.length; i++) {
        int actual = service.findMax(array[i]);
        assertEquals(expected[i], actual, "findMax");
        }
    }

    @Test
    void findMin() {
        LookupArrayService service = new LookupArrayService();
        int[] expected = {2, 1, 0};
        int[][] array = {{7, 5, 8, 2}, {1, 11, 3}, {}};
        for (int i = 0; i < expected.length; i++) {
            int actual = service.findMin(array[i]);
            assertEquals(expected[i], actual, "findMin");
        }
    }

    @Test
    void indexOfMax() {
        LookupArrayService service = new LookupArrayService();
        int[] expected = {2, 1, -1};
        int[][] array = {{7, 5, 8, 2}, {1, 11, 3}, {}};
        for (int i = 0; i < expected.length; i++) {
            int actual = service.indexOfMax(array[i]);
            assertEquals(expected[i], actual, "indexOfMax");
        }
    }

    @Test
    void indexOfMin() {
        LookupArrayService service = new LookupArrayService();
        int[] expected = {3, 0, -1};
        int[][] array = {{7, 5, 8, 2}, {1, 11, 3}, {}};
        for (int i = 0; i < expected.length; i++) {
            int actual = service.indexOfMin(array[i]);
            assertEquals(expected[i], actual, "indexOfMin");
        }
    }

    @Test
    void indexOf() {
        LookupArrayService service = new LookupArrayService();
        int[] value = {5, 3, 1};
        int[] expected = {1, 2, -1};
        int[][] array = {{7, 5, 8, 2}, {1, 11, 3}, {}};
        for (int i = 0; i < expected.length; i++) {
            int actual = service.indexOf(array[i], value[i]);
            assertEquals(expected[i], actual, "indexOf");
        }
    }
}