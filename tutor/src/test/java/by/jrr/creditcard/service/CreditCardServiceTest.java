package by.jrr.creditcard.service;

import by.jrr.creditcard.bean.CreditCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardServiceTest {

    CreditCardService creditCardService;

    @Before
    public void setUp() {
        this.creditCardService = new CreditCardService();
    }


    @Test
    public void withdraw() throws Exception {
        CreditCard[] creditCards = {
                new CreditCard(100.00,200.00,00.00,(short) 1234)
        };
        short[] pin = {1234};
        double[] sum = {50.00};
        CreditCard[] expected = {
                new CreditCard(50.00,200.00,00.00,(short) 1234)
        };
        for (int i = 0; i < creditCards.length; i ++) {
            creditCardService.withdraw(pin[i], sum[i], creditCards[i]);
            assertEquals("Снятие средств с карты (\"withdraw\")", expected[i], creditCards[i]);
        }
    }

    @Test
    public void createCardTest() {
        long[] number = {1234_5678_9123_1234L, 1234_5378_9123_1234L};
        short[] pin = {1234, 1235};
        for (int i = 0; i < 2; i ++) {
            CreditCard expected = new CreditCard();
            expected.setCardNumber(number[i]);
            expected.setPin(pin[i]);
            CreditCard actual = creditCardService.createCard(number[i], pin[i]);
            assertEquals("При создании карты нужно указывать ее номер и пинкод", expected, actual);
        }
    }

    @Test
    public void changeCreditLimit() {
        CreditCard creditCard = new CreditCard();
        double[] creditLimit = {100.00};
        for (int i = 0; i < creditLimit.length; i ++) {
            CreditCard expected = new CreditCard();
            expected.setCreditLimit(creditLimit[i]);
            CreditCard actual = creditCardService.changeCreditLimit(creditLimit[i], creditCard);
            assertEquals("Кредитный лимит можно менять после создания карты.", expected, actual);
        }
    }

    @Test
    public void isDebtIsMoreThanLimit() {
        double[] creditLimit = {100.00, 100.00};
        double[] debt = {101.00, 100.00};
        boolean[] expected = {true, false};
        for (int i = 0; i < creditLimit.length; i ++) {
            CreditCard creditCard = new CreditCard();
            creditCard.setCreditLimit(creditLimit[i]);
            creditCard.setDebt(debt[i]);
            boolean actual = creditCardService.isDebtIsMoreThanLimit(creditCard);
            assertEquals("Если сумма задолженности превышает кредитный лимит", expected[i], actual);
        }
    }

    @Test
    public void isSumLessThatBalance() {
        double[] sum = {50.00, 100.00};
        double[] balance = {100.00, 100.00};
        boolean[] expected = {true, true};
        for (int i = 0; i < sum.length; i ++) {
            CreditCard creditCard = new CreditCard();
            creditCard.setBalance(balance[i]);

            boolean actual = creditCardService.isSumLessThatBalance(creditCard, sum[i]);
            assertEquals("В случае, если денег не хватает", expected[i], actual);
        }

    }

    @Test(expected = Exception.class)
    public void denyWithdrow() throws Exception {
        creditCardService.denyWithdrow();
    }

    @Test
    public void continueWithdrawFromBalance() throws Exception {
        double[] sum = {50.00};
        double[] balance = {100.00};
        double[] expected = {50};
        for (int i = 0; i < sum.length; i ++) {
            CreditCard creditCard = new CreditCard();
            creditCard.setBalance(balance[i]);

            creditCardService.continueWithdrawFromBalance(creditCard, sum[i]);
            assertEquals("Деньги снимаются с карточного баланса. ", expected[i], creditCard.getBalance(), 0);
        }
    }
    @Test (expected = Exception.class)
    public void continueWithdrawFromBalanceShowdTrowException() throws Exception {
        double[] sum = {100.00};
        double[] balance = {50.00};
        for (int i = 0; i < sum.length; i ++) {
            CreditCard creditCard = new CreditCard();
            creditCard.setBalance(balance[i]);

            creditCardService.continueWithdrawFromBalance(creditCard, sum[i]);
        }
    }

    @Test
    public void isPinMatch() {
        short[] pinEntered = {1234, 3434};
        short[] pinStored = {1234, 5666};
        boolean[] expected = {true, false};
        for (int i = 0; i < pinEntered.length; i ++) {
            CreditCard creditCard = new CreditCard();
            creditCard.setPin(pinStored[i]);
            boolean actual = creditCardService.isPinMatch(creditCard, pinEntered[i]);
            assertEquals("пин-коды совпадают?", expected[i], actual);
        }
    }

    @Test
    public void continueWithdrawFromDebt() {
        double[] sum = {100.00};
        double[] debt = {00.00};
        double[] expected = {100.00};
        for (int i = 0; i < sum.length; i ++) {
            CreditCard creditCard = new CreditCard();
            creditCard.setDebt(debt[i]);

            creditCardService.continueWithdrawFromDebt(creditCard, sum[i]);
            assertEquals("остаток суммы нужно брать за счет задолженности по кредиту;", expected[i], creditCard.getDebt(), 0);
        }
    }

}
