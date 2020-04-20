package by.bariloegor.creditcard.bean;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardTest {
    CreditCard creditCard;
    @Before
    public void setUp(){
        creditCard = new CreditCard(1111222233334444L,1111);
    }

    @Test
    public void toStringTest(){
        String expected = "CreditCard{number=1111222233334444, pinCode=1111, balance=0.0, " +
                "creditLimit=0.0, dept=0.0}";
        String actual = creditCard.toString();
        assertEquals("Should equal tostring.", expected, actual);
    }

    @Test
    public void equalsTest(){
        CreditCard expected = creditCard;
        CreditCard actual = new CreditCard(1111222233334444L,1111);
        assertEquals("Cards should equal.", expected, actual);
    }

    @Test
    public void hashcodeTest(){
        CreditCard firstCreditCard = new CreditCard(1111222211112222L, 1111);
        CreditCard secondCreditCard = new CreditCard(1111222211112222L,1111);
        int expected = firstCreditCard.hashCode();
        int actual = secondCreditCard.hashCode();
        assertEquals("Should equal hashcode.", expected, actual);
    }

}