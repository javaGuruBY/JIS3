package by.rybak.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CopyServiceTest {
    CopyService service;

    @BeforeEach
    public void setUp(){
        service = new CopyService();
    }

    @Test
    void copyInRange() {
        int[] array = new int[]{1,34,6,7,8};
        int[] expected = {34,6,7};
        int[] actual;
        actual = service.copyInRange(array, 2,4);

        assertArrayEquals(expected, actual);
    }

    @Test
    void isInRange() {
        int[] array = new int[5];
        boolean actual = service.isInRange(5,1,5);
        boolean actual1 = service.isInRange(8,1,5);

        assertTrue(actual);
        assertFalse(actual1);
    }

    @Test
    void sizeOfArray() {
        int[] array = new int[5];
        int expected = 5;
        int actual = service.sizeOfArray(array,1,5);

        int expected1 = 5;
        int actual1 = service.sizeOfArray(array,1,7);

        assertEquals(expected, actual);
        assertEquals(expected1, actual1);
    }
}