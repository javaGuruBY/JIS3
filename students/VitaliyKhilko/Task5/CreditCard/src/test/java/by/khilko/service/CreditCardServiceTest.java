package by.khilko.service;

import by.khilko.bean.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardServiceTest {
    private CreditCard card;
    private CreditCardService cardService;

    @BeforeEach
    void setUp() {
        card= new CreditCard(22222,12345);
        card.setCreditLimit(2000);
        card.setBalance(1000);
        cardService = new CreditCardService();
    }

    @Test
    void deposit() {
        String message = "Balance should be added";
        double expected = 1350;
        cardService.deposit(card,12345,350);
        double actual = card.getBalance();
        assertEquals(expected, actual, message);
    }

    @Test
    void withdraw() {
        String message = "Should be withdrawn money to the balance";
        double expected = 200;
        cardService.withdraw(card,12345,800);
        double actual = card.getBalance();
        assertEquals(expected, actual, message);
    }

    @Test
    void withdraw2() {
        String message = "Should be withdrawn money to the debt";
        double expected = 750;
        cardService.withdraw(card,12345,1750);
        double actual = card.getDept();
        assertEquals(expected, actual, message);
    }

    @Test
    void correctPincode() {
        String message = "Incorrect pinCode";
        boolean expected = false;
        boolean actual = cardService.deposit(card,14345,750);
        assertEquals(expected, actual, message);
    }
}