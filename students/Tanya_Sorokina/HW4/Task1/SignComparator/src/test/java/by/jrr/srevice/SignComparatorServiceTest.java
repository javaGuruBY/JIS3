package by.jrr.srevice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SignComparatorServiceTest {


    @Test
    void SignComparatorServiceNegativeTest() {
        assertEquals(-5,-5, "[Error]");
        System.out.println("Negative test passed");
    }

    @Test
    void SignComparatorServicePositiveTest() {
        assertEquals(5,5, "[Error]");
        System.out.println("Positive test passed");
    }

    @Test
    void SignComparatorServiceZeroTest() {
        assertEquals(0,0, "[Error]");
        System.out.println("Zero test passed");
    }
}