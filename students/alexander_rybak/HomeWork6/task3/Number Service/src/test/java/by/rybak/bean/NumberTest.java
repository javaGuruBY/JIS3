package by.rybak.bean;

import by.rybak.service.NumberService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {
    Number number;
    NumberService service;

    @BeforeEach
    public void setUp(){
        number = new Number(0,5);
        service = new NumberService();
    }

    @Test
    void getStart() {
        int expected = 0;
        int actual = number.getStart();
        
        assertEquals(expected, actual);
    }

    @Test
    void setStart() {
        int expected = 29;
        number.setStart(29);
        int actual = number.getStart();
        
        assertEquals(expected, actual);
    }

    @Test
    void getEnd() {
        int expected = 5;
        int actual = number.getEnd();

        assertEquals(expected, actual);
    }

    @Test
    void setEnd() {
        int expected = 29;
        number.setEnd(29);
        int actual = number.getEnd();

        assertEquals(expected, actual);
    }

    @Test
    void testEquals() {
        Number number1 = new Number(0,5);
        boolean actual = number.equals(number1);
        
        Number number2 = new Number();
        boolean actual1 = number.equals(number2);
        
        boolean actual2 = number.equals(service);
        
        assertTrue(actual);
        assertFalse(actual1);
        assertFalse(actual2);
    }

    @Test
    void testToString() {
        String expected = "Number{start=0, end=5}";
        String actual = number.toString();

        assertEquals(expected, actual, "should return right strings");
    }
}