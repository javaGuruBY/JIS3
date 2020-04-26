package by.jrr.service;

import by.jrr.bean.LookupArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LookupArrayServiceTest {

    @Test
    void findMax() {
        LookupArray lookupArray = new LookupArray();
        LookupArrayService lookupArrayService = new LookupArrayService();
        int[] expected = {3};
        lookupArray.setArray(new int[]{1, 2, 3});
        for (int i = 0; i < expected.length; i++) {

            int actual = lookupArrayService.findMax(lookupArray);
            assertEquals(expected[i], actual, "findMax");

        }
    }

    @Test
    void findMin() {
        LookupArray lookupArray = new LookupArray();
        LookupArrayService lookupArrayService = new LookupArrayService();
        int[] expected = {1};
        lookupArray.setArray(new int[]{1, 2, 3});
        for (int i = 0; i < expected.length; i++) {

            int actual = lookupArrayService.findMin(lookupArray);
            assertEquals(expected[i], actual, "findMin");

        }
    }

    @Test
    void indexOfMax() {
        LookupArray lookupArray = new LookupArray();
        LookupArrayService lookupArrayService = new LookupArrayService();
        int[] expected = {0};
        lookupArray.setArray(new int[]{10, 2, 3});
        for (int i = 0; i < expected.length; i++) {

            int actual = lookupArrayService.indexOfMax(lookupArray);
            assertEquals(expected[i], actual, "indexOfMax");
    }}

    @Test
    void indexOfMin() {
        LookupArray lookupArray = new LookupArray();
        LookupArrayService lookupArrayService = new LookupArrayService();
        int[] expected = {5};
        lookupArray.setArray(new int[]{10, 2, 3, 5, 8, 1});
        for (int i = 0; i < expected.length; i++) {

            int actual = lookupArrayService.indexOfMin(lookupArray);
            assertEquals(expected[i], actual, "indexOfMin");
        }

    }

    @Test
    void indexOf() {
        LookupArray lookupArray = new LookupArray();
        LookupArrayService lookupArrayService = new LookupArrayService();
        int[] expected = {5};
        lookupArray.setArray(new int[]{10, 2, 3, 5, 8, 1});
        for (int i = 0; i < expected.length; i++) {

            int actual = lookupArrayService.indexOf(lookupArray, 1);
            assertEquals(expected[i], actual, "indexOf");
        }
    }
}