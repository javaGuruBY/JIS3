package by.rybak.service;

import by.rybak.bean.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardServiceTest {
    CreditCard card;
    CreditCardService service;

    @BeforeEach
    public void initialization(){
        card = new CreditCard("1242352345", "1111");
        service = new CreditCardService();
        card.setCreditLimit(500);
    }

    @Test
    void deposit() {
        double expected = 300;
        service.deposit(card,300,"1111");
        double actual = card.getBalance();

        assertEquals(expected, actual, "Should return right Balance");
    }

    @Test
    void deposit1() {
        double expected = 100;
        card.setLoanDebt(200);
        service.deposit(card,300,"1111");
        double actual = card.getBalance();

        assertEquals(expected, actual, "Should return right Balance");
    }

    @Test
    void deposit2() {
        double expected = 100;
        card.setLoanDebt(200);
        service.deposit(card,100,"1111");
        double actual = card.getLoanDebt();

        assertEquals(expected, actual, "Should return right Loan Debt");
    }

    @Test
    void withdraw() {
        double expected = 100;
        service.withdraw(card,100,"1111");
        double actual = card.getLoanDebt();

        assertEquals(expected, actual, "Should return right Loan Debt");
    }

    @Test
    void withdraw1() {
        double expected = 200;
        card.setBalance(100);
        service.withdraw(card,300,"1111");
        double actual = card.getLoanDebt();

        assertEquals(expected, actual, "Should return right Loan Debt");
    }

    @Test
    void withdraw2() {
        double expected = 700;
        card.setBalance(1000);
        service.withdraw(card,300,"1111");
        double actual = card.getBalance();

        assertEquals(expected, actual, "Should return right Balance");
    }

    @Test
    void pinIsTrue() {
        boolean expected = true;
        boolean actual = service.pinIsTrue("1111");

        assertEquals(expected, actual, "Should return right equals of pins");
    }

    @Test
    void pinIsTrue1() {
        boolean expected = false;
        boolean actual = service.pinIsTrue("4563");

        assertEquals(expected, actual, "Should return right equals of pins");
    }
}