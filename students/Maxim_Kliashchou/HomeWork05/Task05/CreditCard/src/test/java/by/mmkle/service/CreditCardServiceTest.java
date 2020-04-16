package by.mmkle.service;

import by.mmkle.bean.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardServiceTest {
    private CreditCard creditCard;
    private CreditCardService creditCardService;

    @BeforeEach
    void setUp(){
        creditCard = new CreditCard("6467041946153399", 1111);
        creditCard.setCreditLimit(1000);
        creditCardService = new CreditCardService();
    }

    @Test
    void withdrawWithDebt() {
        String testMessage = "Should withdraw money with debt";
        String expected = "CreditCard" +
                            "{number='6467041946153399', " +
                            "pinCode=1111, " +
                            "balance=0.0, " +
                            "creditLimit=1000.0, " +
                            "creditDebt=500.0}";
        creditCardService.withdraw(creditCard, 1111, 500);
        String actual = creditCard.toString();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void withdrawWithOutDebt() {
        String testMessage = "Should withdraw money without debt";
        creditCard.setBalance(1000);
        String expected = "CreditCard" +
                            "{number='6467041946153399', " +
                            "pinCode=1111, " +
                            "balance=500.0, " +
                            "creditLimit=1000.0, " +
                            "creditDebt=0.0}";
        creditCardService.withdraw(creditCard, 1111, 500);
        String actual = creditCard.toString();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void withdrawCanceledNotEnoughMoney() {
        String testMessage = "Shouldn't withdraw";
        boolean expected = false;
        boolean actual = creditCardService.withdraw(creditCard, 1111, 1500);;
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void depositWithOutDebt() {
        String testMessage = "Should diposit money without debt";
        String expected = "CreditCard" +
                "{number='6467041946153399', " +
                "pinCode=1111, " +
                "balance=500.0, " +
                "creditLimit=1000.0, " +
                "creditDebt=0.0}";
        creditCardService.deposit(creditCard, 1111, 500);
        String actual = creditCard.toString();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void depositWithDebt() {
        String testMessage = "Should diposit money with debt";
        creditCard.setCreditDebt(500);
        String expected = "CreditCard" +
                "{number='6467041946153399', " +
                "pinCode=1111, " +
                "balance=0.0, " +
                "creditLimit=1000.0, " +
                "creditDebt=0.0}";
        creditCardService.deposit(creditCard, 1111, 500);
        String actual = creditCard.toString();
        assertEquals(expected, actual, testMessage);
    }
    @Test
    void depositOnBalanceWithDebt() {
        String testMessage = "Should diposit money with debt on balance";
        creditCard.setCreditDebt(300);
        String expected = "CreditCard" +
                "{number='6467041946153399', " +
                "pinCode=1111, " +
                "balance=200.0, " +
                "creditLimit=1000.0, " +
                "creditDebt=0.0}";
        creditCardService.deposit(creditCard, 1111, 500);
        String actual = creditCard.toString();
        assertEquals(expected, actual, testMessage);
    }
}