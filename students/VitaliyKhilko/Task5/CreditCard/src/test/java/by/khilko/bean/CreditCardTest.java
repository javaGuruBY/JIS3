package by.khilko.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {
    private CreditCard card;
    private CreditCard card2;

    @BeforeEach
    void setUp() {
        card = new CreditCard(23456789,2222);
        card2 = new CreditCard(23456789,2222);
        card.setBalance(1000);
        card.setCreditLimit(2000);
        card2.setBalance(1000);
        card2.setCreditLimit(2000);
    }


    @Test
    void getNumber() {
        String message = "Return number of card";
        int expected = 23456789;
        int actual = card.getNumber();
        assertEquals(expected, actual, message);
    }

    @Test
    void setNumber() {
        String message = "Set and return number of card";
        card.setNumber(23456788);
        int expected = 23456788;
        int actual = card.getNumber();
        assertEquals(expected, actual, message);
    }

    @Test
    void getPinCode() {
        String message = "Return pinCode of card";
        int expected = 2222;
        int actual = card.getPinCode();
        assertEquals(expected, actual, message);
    }

    @Test
    void setPinCode() {
        String message = "Set and return pinCode of card";
        card.setPinCode(2345);
        int expected = 2345;
        int actual = card.getPinCode();
        assertEquals(expected, actual, message);
    }

    @Test
    void getBalance() {
        String message = "Return balance on the card";
        double expected = 1000;
        double actual = card.getBalance();
        assertEquals(expected, actual, message);
    }

    @Test
    void setBalance() {
        String message = "Set and return balance on the card";
        card.setBalance(1500);
        double expected = 1500;
        double actual = card.getBalance();
        assertEquals(expected, actual, message);
    }

    @Test
    void getCreditLimit() {
        String message = "Return creditLimit by card";
        double expected = 2000;
        double actual = card.getCreditLimit();
        assertEquals(expected, actual, message);
    }

    @Test
    void setCreditLimit() {
        String message = "Set and return creditLimit by card";
        card.setCreditLimit(2500);
        double expected = 2500;
        double actual = card.getCreditLimit();
        assertEquals(expected, actual, message);
    }

    @Test
    void getDept() {
        String message = "Return card debt";
        double expected = 0;
        double actual = card.getDept();
        assertEquals(expected, actual, message);
    }

    @Test
    void setDept() {
        String message = "Set and return card debt";
        card.setDept(200);
        double expected = 200;
        double actual = card.getDept();
        assertEquals(expected, actual, message);
    }

    @Test
    void testEquals() {
        String message = "Equals of two card";
        boolean expected = true;
        boolean actual = card.equals(card2);
        assertEquals(expected, actual, message);
    }

    @Test
    void testHashCode() {
        String message = "Equals hashCode of two card";
        int expected = card.hashCode();
        int actual = card2.hashCode();
        assertEquals(expected, actual, message);
    }

    @Test
    void testToString() {
        String message = "Return method toString of card";
        String expected = "CreditCard{number=23456789, pinCode=2222, balance=1000.0, creditLimit=2000.0, dept=0.0}";
        String actual = card.toString();
        assertEquals(expected, actual, message);
    }
}