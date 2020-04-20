package by.bariloegor.creditcard.service;

import by.bariloegor.creditcard.bean.CreditCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardServiceTest {
    private CreditCard creditCard;
    private CreditCardService creditCardService;


    @Before
    public void setUp(){
        creditCardService = new CreditCardService();
    }
    @Test
    public void createCardTest(){
        long[] number = {1111222211112222L, 2222333322223333L};
        int[] pinCode = {1111, 2222};
        for(int i = 0; i < number.length; i++){
            CreditCard expected = new CreditCard(number[i], pinCode[i]);
            CreditCard actual = creditCardService.createCard(number[i], pinCode[i]);
            assertEquals("Creating credit card.", expected, actual);
        }
    }

    @Test
    public void changeCreditLimitTest(){
        creditCard = new CreditCard(1111222233334444L, 2233);
        double[] creditLimit = {50, 200};
        double[] expected = {50, 200};
        for(int i = 0; i < creditLimit.length; i++){
            creditCardService.changeCreditLimit(creditCard, creditLimit[i]);
            double actual = creditCard.getCreditLimit();
            assertEquals("Should change credit limit.", expected[i], actual, 0);
        }
    }

    @Test
    public void depositTest(){
        creditCard = new CreditCard(1111222233334444L, 2233);
        double[] sum = {100,200};
        double[] expected = {100,200};
        for(int i = 0; i < expected.length; i++){
            creditCard.setBalance(0);
            creditCardService.deposit(creditCard, 2233, sum[i]);
            double actual = creditCard.getBalance();
            assertEquals("Deposit sum.", expected[i], actual, 0);
        }
    }

    @Test
    public void proceedDepositTest(){
        creditCard = new CreditCard(1111222233334444L, 2233);
        double[] balance = {100,0};
        double[] dept = {0,50};
        double[] expected = {200,50};
        for(int i = 0; i < expected.length; i++){
            creditCard.setBalance(balance[i]);
            creditCard.setDept(dept[i]);
            creditCardService.proceedDeposit(creditCard, 100);
            double actual = creditCard.getBalance();
            assertEquals("Proceed deposit.", expected[i], actual, 0);
        }
    }

    @Test
    public void depositWithDeptRepaymentTest(){
        creditCard = new CreditCard(1111222233334444L, 2233);
        double[] sum = {100,100,100};
        double[] dept = {0,50,200};
        double[] expectedBalance = {100,50,0};
        double[] expectedDept = {0, 0, 100};
        for(int i = 0; i < expectedBalance.length; i++){
            creditCard.setBalance(0);
            creditCard.setDept(dept[i]);
            creditCardService.depositWithDeptRepayment(creditCard, sum[i]);
            double actualBalance = creditCard.getBalance();
            double actualDept = creditCard.getDept();
            assertEquals("Deposit with dept repayment.", expectedBalance[i], actualBalance, 0);
            assertEquals("Deposit with dept repayment.", expectedDept[i], actualDept, 0);
        }

    }

    @Test
    public void withdrawTest(){
        creditCard = new CreditCard(1111222233334444L, 2233);
        double[] sum = {20,40};
        double[] expected = {80,60};
        for(int i = 0; i < expected.length; i++){
            creditCard.setBalance(100);
            creditCardService.withdraw(creditCard, 2233, sum[i]);
            double actual = creditCard.getBalance();
            assertEquals("Withdraw.", expected[i], actual, 0);
        }
    }

    @Test
    public void withdrawFromDeptTest(){
        creditCard = new CreditCard(1111222233334444L, 2233);
        creditCard.setCreditLimit(1000);
        double[] sum = {50,200};
        double[] balance = {0,100};
        double[] expected = {50,100};
        for(int i = 0; i < expected.length; i++){
            creditCard.setDept(0);
            creditCard.setBalance(balance[i]);
            creditCardService.withdrawFromDept(creditCard, sum[i]);
            double actual = creditCard.getDept();
            assertEquals("Withdraw from dept.", expected[i], actual, 0);
        }
    }

    @Test
    public void isSumMoreThanDeptTest(){
        creditCard = new CreditCard(1111222233334444L, 2233);
        double[] sum = {100,100};
        double[] dept = {50,200};
        boolean[] expected = {true, false};
        for(int i = 0; i < expected.length; i++){
            creditCard.setDept(dept[i]);
            boolean actual = creditCardService.isSumMoreThanDept(creditCard, sum[i]);
            assertEquals("Is sum more than dept.", expected[i], actual);
        }
    }

    @Test
    public void withdrawFromBalanceTest(){
        creditCard = new CreditCard(1111222233334444L, 2233);
        double[] balance = {100,200};
        double[] sum = {10,20};
        double[] expected = {90,180};
        for(int i = 0; i < expected.length; i++){
            creditCard.setBalance(balance[i]);
            creditCardService.withdrawFromBalance(creditCard, sum[i]);
            double actual = creditCard.getBalance();
            assertEquals("Withdraw from balance.", expected[i], actual, 0);
        }
    }

    @Test
    public void isSumLessThanBalanceTest(){
        creditCard = new CreditCard(1111222233334444L, 2233);
        double[] balance = {100, 200, 150};
        double[] sum = {90, 300, 150};
        boolean[] expected = {true, false};
        for(int i = 0; i < expected.length; i++){
            creditCard.setBalance(balance[i]);
            boolean actual = creditCardService.isSumLessThanBalance(creditCard, sum[i]);
            assertEquals("Is sum less than balance.", expected[i], actual);
        }
    }

    @Test
    public void proceedWithdrawTest(){
        creditCard = new CreditCard(1111222233334444L, 2233);
        creditCard.setCreditLimit(1000);
        double expected = 20;
        creditCard.setBalance(100);
        creditCardService.proceedWithdraw(creditCard,80);
        double actual = creditCard.getBalance();
        assertEquals("Should withdraw from balance.", expected, actual, 0);
        creditCardService.proceedWithdraw(creditCard, 50);
        expected = 30;
        actual = creditCard.getDept();
        assertEquals("Should withdraw from dept.", expected, actual, 0);
    }

    @Test
    public void isPinCodeRightTest(){
        creditCard = new CreditCard(1111222233334444L, 2233);
        boolean[] expected = {true, false};
        int[] pin = {2233, 1122};
        for(int i = 0; i < expected.length; i++){
            boolean actual = creditCardService.isPinCodeRight(creditCard, pin[i]);
            assertEquals("Pin-codes should equal.", expected[i], actual);
        }
    }

    @Test
    public void isNewDeptMoreThanCreditLimitTest(){
        creditCard = new CreditCard(1111222233334444L, 2233);
        double[] creditLimit = {100,200,400};
        double[] newDept = {100,400,200};
        boolean[] expected = {false, true, false};
        for(int i = 0; i < expected.length; i++){
            creditCard.setDept(0);
            creditCard.setCreditLimit(creditLimit[i]);
            boolean actual = creditCardService.isNewDeptMoreThanCreditLimit(creditCard, newDept[i]);
            assertEquals("Is new dept more than credit limit.", expected[i], actual);
        }

    }
}