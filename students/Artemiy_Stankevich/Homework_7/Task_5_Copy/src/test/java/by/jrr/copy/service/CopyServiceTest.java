package by.jrr.copy.service;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CopyServiceTest {
CopyService copyService = new CopyService();
    @Test
    void copyInRange() {
        int [] arraysTesting = {2,4,6,8,10,12};
        String expected = "[4, 6, 8]";
        int [] newArrayTesting = copyService.copyInRange(arraysTesting, 4, 8);
        String actual = Arrays.toString(newArrayTesting);
        assertEquals(expected, actual, "[ERROR]");
    }
}