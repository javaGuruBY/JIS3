package by.jrr.service;

import by.jrr.bean.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardServiceTest {

    private CreditCard creditCardTest;
    private CreditCardService creditCardService;

    @BeforeEach
    public void init(){
        creditCardTest = new CreditCard(1234123412, 1111);
        creditCardService = new CreditCardService();
        creditCardTest.setBalanceCreditCard(100);
        creditCardTest.setCreditLimit(800);
    }



    @Test
    void depositTest1() {
        creditCardService.deposit(creditCardTest, 1111, 225);
        double expected = 325;
        double actual = creditCardTest.getBalanceCreditCard();
        assertEquals(expected, actual, "Error");
        System.out.println("depositTest1 has passed");
    }

    @Test
    void withdrawTest() {
        creditCardService.withdraw(creditCardTest, 1111, 50);
        double expected = 50;
        double actual = creditCardTest.getBalanceCreditCard();
        assertEquals(expected, actual, "Error");
        System.out.println("withdrawTest has passed");
    }

    @Test
    void depositTest2() {
        creditCardService.deposit(creditCardTest, 1111, 225);
        creditCardTest.setLoanDebt(100);
        double expected = 125;
        double actual = creditCardTest.getBalanceCreditCard();
        assertEquals(expected, actual, "Error");
        System.out.println("depositTest has passed");
    }

    @Test
    void thePinCodeIsTrueTest(){
       boolean expected = true;
       boolean actual = creditCardService.deposit(creditCardTest, 1111, 100);
       assertEquals(expected, actual,"ERROR");
       System.out.println("thePinCodeIsTrueTest has passed");
    }

    @Test
    void thePinCodeIsTrueTest2(){
        boolean expected = false;
        boolean actual = creditCardService.deposit(creditCardTest, 1234, 100);
        assertEquals(expected, actual,"ERROR");
        System.out.println("thePinCodeIsTrueTest has passed");
    }

}