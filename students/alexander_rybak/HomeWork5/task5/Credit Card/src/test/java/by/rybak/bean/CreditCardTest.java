package by.rybak.bean;

import by.rybak.service.CreditCardService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardTest {
    CreditCard card;

    @BeforeEach
    public void initialization(){
        card = new CreditCard("1242352345", "1111");
        card.setCreditLimit(500);
    }

    @Test
    void getCardNumber() {
        String expected = "1242352345";
        String actual = card.getCardNumber();

        assertEquals(expected, actual, "should return right Card number");
    }

    @Test
    void setCardNumber() {
        String expected = "346345647";
        card.setCardNumber("346345647");
        String actual = card.getCardNumber();

        assertEquals(expected, actual, "should return right Card number");
    }

    @Test
    void getPin() {
        String expected = "1111";
        String actual = card.getPin();

        assertEquals(expected, actual, "should return right pin");
    }

    @Test
    void setPin() {
        String expected = "2222";
        card.setPin("2222");
        String actual = card.getPin();

        assertEquals(expected, actual, "should return right pin");
    }

    @Test
    void getBalance() {
        double expected = 0;
        double actual = card.getBalance();

        assertEquals(expected, actual, "should return right balance");
    }

    @Test
    void setBalance() {
        double expected = 234;
        card.setBalance(234);
        double actual = card.getBalance();

        assertEquals(expected, actual, "should return right balance");
    }

    @Test
    void getCreditLimit() {
        double expected = 500;
        double actual = card.getCreditLimit();

        assertEquals(expected, actual, "should return right credit limit");
    }

    @Test
    void setCreditLimit() {
        double expected = 100;
        card.setCreditLimit(100);
        double actual = card.getCreditLimit();

        assertEquals(expected, actual, "should return right credit limit");
    }

    @Test
    void getLoanDebt() {
        double expected = 0;
        double actual = card.getLoanDebt();

        assertEquals(expected, actual, "should return right Loan Debt");
    }

    @Test
    void setLoanDebt() {
        double expected = 100;
        card.setLoanDebt(100);
        double actual = card.getLoanDebt();

        assertEquals(expected, actual, "should return right Loan Debt");
    }

    @Test
    void testEquals() {
        boolean expected = true;
        boolean actual = card.equals(card);

        assertEquals(expected, actual, "Should return right equals of object");
    }
}