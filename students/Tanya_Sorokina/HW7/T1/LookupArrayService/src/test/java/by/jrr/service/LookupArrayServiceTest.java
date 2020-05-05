package by.jrr.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LookupArrayServiceTest {

    LookupArrayService lookupArrayService;

    @BeforeEach
    public void setUp(){
        lookupArrayService = new LookupArrayService();
    }

    @Test
    void findMaxTest() {
        int[] arrayTest1 = {1,2,3,4,5,6,7,8,9,11,50};
        int expected = 50;
        int actual = lookupArrayService.findMax(arrayTest1);
        assertEquals(expected, actual, "Error");
        System.out.println("findMaxTest has passed");
    }

    @Test
    void findMinTest() {
        int[] arrayTest2 = {1,5,6,32,1,5,9,8,7,99};
        int expected = 1;
        int actual = lookupArrayService.findMin(arrayTest2);
        assertEquals(expected, actual, "Error");
        System.out.println("findMinTest has passed");
    }

    @Test
    void indexOfMaxTest() {
        int[] arrayTest3 = {1,5,6,32,1,5,9,8,7,99,103};
        int expected = 10;
        int actual = lookupArrayService.indexOfMax(arrayTest3);
        assertEquals(expected, actual, "Error");
        System.out.println("indexOfMaxTest has passed");
    }

    @Test
    void indexOfMinTest() {
        int[] arrayTest3 = {1,5,6,32,1,5,9,8,7,99,103};
        int expected = 0;
        int actual = lookupArrayService.indexOfMax(arrayTest3);
        assertEquals(expected, actual, "Error");
        System.out.println("indexOfMinTest has passed");
    }

    @Test
    void indexOfTest() {
        int[] arrayTest4 = {1,5,6,32,1,9,8,7,99,103};
        int expected = 3;
        int actual = lookupArrayService.indexOf(arrayTest4, 32);
        assertEquals(expected, actual, "Error");
        System.out.println("indexOfTest has passed");
    }

}