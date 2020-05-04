package by.jrr.creditcard.service;

import by.jrr.creditcard.bean.CreditCard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditCardService {

    Logger log = LoggerFactory.getLogger(CreditCardService.class);

    public void deposit() {

    }

    public void withdraw(short pin, double sum, CreditCard creditCard) throws Exception {
        if (isPinMatch(creditCard, pin)){
            proceedWithdraw(creditCard, sum);
        } else {
            denyWithdrow();
        }
    }

    public void denyWithdrow() throws Exception {
        throw new Exception(" operation error");

    }

    public boolean isPinMatch(CreditCard creditCard, short pin) {
        return  (creditCard.getPin() == pin);
    }

    public void proceedWithdraw(CreditCard creditCard, double sum) throws Exception {
        if (isSumLessThatBalance(creditCard, sum)) {
            continueWithdrawFromBalance(creditCard, sum);
        } else {
            continueWithDrawFromCreditLimit(creditCard, sum);
        }
    }

    public void continueWithdrawFromBalance(CreditCard creditCard, double sum) throws Exception {
        if (creditCard.getBalance() > sum) {
            creditCard.setBalance(creditCard.getBalance() - sum);
        } else {
            log.error("creditCard.getBalance() is less that sum");
            log.error(creditCard.toString());
            throw new Exception(" Illegal operation! ");
        }
    }

    public boolean isSumLessThatBalance(CreditCard creditCard, double sum) {
        return  (sum <= creditCard.getBalance()) ;
    }

    public void continueWithDrawFromCreditLimit(CreditCard creditCard, double sum) throws Exception {
        if (isDebtIsMoreThanLimit(creditCard)) {
            continueWithdrawFromDebt(creditCard, sum);
        } else {
            denyWithdrow();
        }
    }

    public void continueWithdrawFromDebt(CreditCard creditCard, double sum) {
        creditCard.setDebt(creditCard.getDebt() + sum);

    }

    public boolean isDebtIsMoreThanLimit(CreditCard creditCard) {
        return  (creditCard.getDebt() > creditCard.getCreditLimit());
    }

    public CreditCard createCard(long cardNumber, short pin) {
        return new CreditCard(cardNumber, pin);
    }

    public CreditCard changeCreditLimit(double limit, CreditCard creditCard) {
        creditCard.setCreditLimit(limit);
        return creditCard;

    }
}
