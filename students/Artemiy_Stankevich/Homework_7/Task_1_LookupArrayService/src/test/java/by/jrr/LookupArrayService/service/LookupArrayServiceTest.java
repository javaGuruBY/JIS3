package by.jrr.LookupArrayService.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LookupArrayServiceTest {
    LookupArrayService lookupArrayService;
    @BeforeEach
    void init() {
        lookupArrayService = new LookupArrayService();
    }

    @Test
    void findMaxTest() {
        int [] arrayTest = {1, 2, 3, 4, 5, 6, 7, 8, 10, 9};
        int expected = 10;
        int actual = lookupArrayService.findMax(arrayTest);
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void findMinTest() {
        int [] arrayTest = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 1;
        int actual = lookupArrayService.findMin(arrayTest);
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void indexOfMaxTest() {
        int [] arrayTest = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 9;
        int actual = lookupArrayService.indexOfMax(arrayTest);
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void indexOfMinTest() {
        int [] arrayTest = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 0;
        int actual = lookupArrayService.indexOfMin(arrayTest);
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void indexOfTest() {
        int [] arrayTest = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 7;
        int actual = lookupArrayService.indexOf(arrayTest,8);
        assertEquals(expected, actual, "[ERROR]");
    }
}