package by.rybak.service;

import by.rybak.bean.Number;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberServiceTest {
    Number number;
    NumberService service;

    @BeforeEach
    public void setUp(){
        number = new Number(0,5);
        service = new NumberService();
    }

    @Test
    void rangeSum() {
        int[] expected = {15,0,21};
        int[] actual = new int[expected.length];
        actual[0] = service.rangeSum(number);

        number.setEnd(0);
        number.setStart(0);
        actual[1] = service.rangeSum(number);

        number.setEnd(0);
        number.setStart(6);
        actual[2] = service.rangeSum(number);


        for(int i = 0; i < actual.length; i++){
            assertEquals(expected[i],  actual[i], "Should return right count of numbers!");
        }
    }

    @Test
    void rangeEvenCount() {
        int[] expected = {2,0,3};
        int[] actual = new int[expected.length];
        actual[0] = service.rangeEvenCount(number);

        number.setEnd(0);
        number.setStart(0);
        actual[1] = service.rangeEvenCount(number);

        number.setEnd(0);
        number.setStart(6);
        actual[2] = service.rangeEvenCount(number);

        for(int i = 0; i < actual.length; i++){
            assertEquals(expected[i],  actual[i], "Should return right count of numbers!");
        }
    }

    @Test
    void isEven() {
        boolean actual = service.isEven(2);
        boolean actual1 = service.isEven(1);

        assertTrue(actual);
        assertFalse(actual1);
    }
}