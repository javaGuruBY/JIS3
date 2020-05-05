package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.SignComparatorService;

public class SignComparatorJUnitTest extends Assert {
    private SignComparatorService service = new SignComparatorService();
    @Before
    public void setUp(){
        service = new SignComparatorService();
    }
    @Test
    public void negativeTest(){
        int myNumber = -121;
        String expected = "Number is negative";
        String actual = service.compare(myNumber);
        assertEquals("Should be negative", expected, actual);
    }

    @Test
    public void positiveTest(){
        int myNumber = 431;
        String expected = "Number is positive";
        String actual = service.compare(myNumber);
        assertEquals("Should be positive", expected, actual);
    }

    @Test
    public void zeroTest(){
        int myNumber = 0;
        String expected = "Number is equal to zero";
        String actual = service.compare(myNumber);
        assertEquals("Should be zero", expected, actual);
    }
}
