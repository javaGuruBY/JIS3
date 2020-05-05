package by.jrr.service;

import by.jrr.bean.CreditCard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardServiceTest {
    CreditCardService creditCardService;
    @BeforeEach
    public void setUp(){
        this.creditCardService = new CreditCardService();
    }
    @Test
    void createCardTest() {
        long[] number = {1234_5678_9123_1234L, 1234_4678_9123_1234L} ;
        short[] pin = {1234, 1235};
        for (int i = 0; i < 2; i ++){
            CreditCard expected = new CreditCard();
            expected.setCardNumber(number[i]);
            expected.setPinCode(pin[i]);
            CreditCard actual = creditCardService.createCard(number[i], pin[i]);
            assertEquals(expected, actual, "При создании карты нужно указывать ее номер и пинкод");
        }

    }

    @Test
    void changeCreditLimitTest() {
        CreditCard creditCard = new CreditCard();
        double[] creditLimit = {100.00};
        for (int i = 0; i < creditLimit.length; i ++){
            CreditCard expected = new CreditCard();
            expected.setCreditLimit(creditLimit[i]);

            CreditCard actual = creditCardService.changeCreditLimit(creditLimit[i], creditCard);
            assertEquals(expected, actual, "Кредитный лимит можно менять после создания карты");
        }
    }

    @Test
    void isDebtMoreThanLimit() {
        double[] creditLimit = {100.00, 100.00};
        double[] debt = {101.00, 100.00};
        boolean[] expected = {true, false};
        for (int i = 0; i < creditLimit.length; i ++){
            CreditCard creditCard = new CreditCard();
            creditCard.setCreditLimit(creditLimit[i]);
            creditCard.setCreditLimitDebt(debt[i]);
            boolean actual = creditCardService.isDebtMoreThanLimit(creditCard);
            assertEquals(expected[i], actual, "Если сумма задолженности превышает кредитный лимит");
        }
    }

    @Test
    void sumIsLessThanBalance() {
        double[] sum = {50.00, 100.00};
        double[] balance = {100.00, 100.00};
        boolean[] expected = {true, true};
        for (int i = 0; i < sum.length; i ++){
            CreditCard creditCard = new CreditCard();
            creditCard.setBalanceAccount(balance[i]);
            boolean actual = creditCardService.sumIsLessThanBalance(creditCard, sum[i]);
            assertEquals(expected[i], actual, "В случае, если денег не хватает");
        }
    }

    @Test
    void denyWithdrawShouldTrowException() {
        Exception exception = assertThrows(Exception.class, () -> {
            creditCardService.denyWithdraw();
        });
        assertEquals("operation error", exception.getMessage());
        assertTrue(exception.getMessage().contains("operation"));
    }

    @Test
    void continueWithdrawFromBalance() throws Exception {
        double[] sum = {50.00};
        double[] balance = {100.00};
        double[] expected = {50.00};
        for (int i = 0; i < sum.length; i ++){
            CreditCard creditCard = new CreditCard();
            creditCard.setBalanceAccount(balance[i]);
            creditCardService.continueWithdrawFromBalance(creditCard, sum[i]);
            assertEquals(expected[i], creditCard.getBalanceAccount(), "Деньги снимаются с карточного баланса");
        }
    }

    @Test
    void isPinMatch() {
        short[] pinEntered = {1234, 3434};
        short[] pinStored = {1234, 5666};
        boolean[] expected = {true, false};
        for (int i = 0; i < pinEntered.length; i ++){
            CreditCard creditCard = new CreditCard();
            creditCard.setPinCode(pinStored[i]);
            boolean actual = creditCardService.isPinMatch(creditCard, pinEntered[i]);

            assertEquals(expected[i], actual, "Если пин-коды не совпадают");

        }
    }

    @Test
    void continueWithdrawFromCreditLimitDebt() throws Exception {
        double[] sum = {100.00};
        double[] debt = {00.00};
        double[] expected = {100.00};
        for (int i = 0; i < sum.length; i++) {
            CreditCard creditCard = new CreditCard();
            creditCard.setCreditLimitDebt(debt[i]);

            creditCardService.continueWithdrawFromCreditLimitDebt(creditCard, sum[i]);
            assertEquals(expected[i], creditCard.getCreditLimitDebt(), " остаток суммы нужно брать за счет задолженности по кредиту");
        }
    }

    @Test
    void withdraw() throws Exception {
        CreditCard[] creditCards = {
                new CreditCard(100.00, 200, 0, (short)1234)
        };
        short[] pin = {1234};
        double[] sum = {50.00};
        CreditCard[] expected = {new CreditCard(50, 200, 0, (short)1234)};
        for (int i = 0; i < creditCards.length; i++) {
            creditCardService.withdraw(pin[i], sum[i], creditCards[i]);
            assertEquals(expected[i], creditCards[i], "Снятие денег со счёта");
        }
    }

    @Test
    void calculatedSum() throws Exception {

        double[] debt = {00.00, 50.00};
        double[] depositSum = {100.00, 100.00};
        double[] expected = {100.00, 50.00};
        for (int i = 0; i < debt.length; i++) {
            CreditCard creditCard = new CreditCard();
            creditCard.setCreditLimitDebt(debt[i]);

            double actual = creditCardService.calculatedSum(creditCard, depositSum[i]);

            assertEquals(expected[i], actual, "В первую очередь зачисление покрывает задолженность по кредиту;");
        }
    }

    @Test
    void creditLimitDebtEnrollment() throws Exception {

        double[] depositSum = {100.00, 100.00};
        double[] expected = {100.00, 50.00};
        double[] debt = {00.00, 50.00};
        for (int i = 0; i < depositSum.length; i++) {
            CreditCard creditCard = new CreditCard();
            creditCard.setCreditLimitDebt(debt[i]);

            creditCardService.creditLimitDebtEnrollment(creditCard, depositSum[i]);

            assertEquals(expected[i], creditCard.getBalanceAccount(), "В первую очередь зачисление покрывает задолженность по кредиту;");
        }
    }

    @Test
    void deposit() throws Exception {
        CreditCard[] creditCards = {
                new CreditCard(100.00, 200, 0, (short)1234)
        };
        short[] pin = {1234};
        double[] sum = {50.00};
        CreditCard[] expected = {new CreditCard(50, 200, 0, (short)1234)};
        for (int i = 0; i < creditCards.length; i++) {
            creditCardService.deposit(creditCards[i], (short)pin[i], sum[i]);
            assertEquals(expected[i], creditCards[i], "Снятие денег со счёта");
        }
    }
}