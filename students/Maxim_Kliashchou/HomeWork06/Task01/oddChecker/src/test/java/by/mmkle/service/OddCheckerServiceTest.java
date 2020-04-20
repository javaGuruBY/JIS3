package by.mmkle.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OddCheckerServiceTest {
    OddCheckerService service;

    @BeforeEach
    public void setUp(){
        service = new OddCheckerService();
    }

    @Test
    void forOddChecker() {
        String testMessage = "Should be 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, " +
                "39, 41, 43, 45, 47, 49";
        List<Integer> expected = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37,
                39, 41, 43, 45, 47, 49);
        List<Integer> actual = service.forOddChecker();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void whileOddChecker() {
        String testMessage = "Should be 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, " +
                "39, 41, 43, 45, 47, 49";
        List<Integer> expected = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37,
                39, 41, 43, 45, 47, 49);
        List<Integer> actual = service.whileOddChecker();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void doWhileOddChecker() {
        String testMessage = "Should be 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, " +
                "39, 41, 43, 45, 47, 49";
        List<Integer> expected = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37,
                39, 41, 43, 45, 47, 49);
        List<Integer> actual = service.doWhileOddChecker();
        assertEquals(expected, actual, testMessage);
    }
}