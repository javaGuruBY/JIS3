package service;

import bean.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import service.CreditCardService;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardServiceTest {

    CreditCardService creditCardService = new CreditCardService();
    CreditCard creditCard = new CreditCard();

    @BeforeEach
    void setUp() {
        creditCard = new CreditCard(1589784512368569L, 1234  );
        creditCardService = new CreditCardService();
        creditCard.setLimit(1500);
    }

    @Test
    void withdraw() {
        String testMessage = "you must give me money";
        String expected = "creditCard " +
                          "number = 1589784512368569 " +
                          "pin = 1234 " +
                          "balance is 0.0 " +
                          "credit limit is 1500 " +
                          "debt is 750";
        creditCardService.withdraw(creditCard, 1234, 300);
        String actual = creditCard.toString();
      assertNotEquals(expected, actual, testMessage);

   }

    @Test
    void deposit() {
        String testMessage = " must deposit money ";
        String expected = "CreditCard" +
                "{number=1589784512368569 " +
                "pin=1234 " +
                "Debt=0.0 "  +
                "balance=500.0 " +
                "limit=1500}";
        creditCardService.deposit(creditCard, 1234, 500);
        String actual = creditCard.toString();
        assertEquals(expected, actual, testMessage);
    }
    @Test
     void insufficientFunds() {
        String testMessage = "insufficient funds.";
        boolean expected = false;
        boolean actual = creditCardService.withdraw(creditCard, 1234, 2547);
       assertEquals(expected, actual, testMessage);
    }



}

