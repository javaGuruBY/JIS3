package by.jrr.service;

import by.jrr.bean.CreditCard;

public class CreditCardService {


    public void deposit(CreditCard creditCard, short pin, double depositSum) throws Exception {
        if(isPinMatch(creditCard, pin)) {
            creditLimitDebtEnrollment(creditCard, depositSum);
        } else {
            denyWithdraw();
        }

    }

    public void creditLimitDebtEnrollment(CreditCard creditCard, double depositSum) throws Exception {
        if(creditCard.getCreditLimitDebt() == 0) {
            creditCard.setBalanceAccount(depositSum);
        } else {
            creditCard.setBalanceAccount(calculatedSum(creditCard, depositSum));
        }
    }

    public double calculatedSum(CreditCard creditCard, double depositSum) throws Exception {
        if(creditCard.getCreditLimitDebt() < depositSum) {
            depositSum = depositSum - creditCard.getCreditLimitDebt();
            creditCard.setCreditLimitDebt(0.00);
            return depositSum;
        } else {
            throw new Exception("Enrolled value less than credit debt");
        }

    }


    public void withdraw(short pin, double sum, CreditCard creditCard) throws Exception {
        if(isPinMatch(creditCard, pin)) {
            proceedWithdraw(creditCard, sum);
        } else {
            denyWithdraw();
        }


    }

    public boolean isPinMatch(CreditCard creditCard, short pin) {
        if (creditCard.getPinCode() == pin) {
            return true;
        } else {
            return false;
        }
    }

    public void denyWithdraw() throws Exception {
        throw new Exception("operation error");
    }

    public void proceedWithdraw(CreditCard creditCard, double sum) throws Exception {
        if(sumIsLessThanBalance(creditCard, sum)) {
            continueWithdrawFromBalance(creditCard, sum);
        } else {
            continueWithdrawFromCreditLimit(creditCard, sum);
        }
    }

    public void continueWithdrawFromBalance(CreditCard creditCard, double sum) throws Exception {
        if (creditCard.getBalanceAccount() > sum) {
            creditCard.setBalanceAccount(creditCard.getBalanceAccount() - sum);
        } else {
            throw new Exception("illegal operation");
        }
    }

    public boolean sumIsLessThanBalance(CreditCard creditCard, double sum) {
        if (sum <= creditCard.getBalanceAccount()) {
            return true;
        } else {
            return false;
        }
    }

    public void continueWithdrawFromCreditLimit(CreditCard creditCard, double sum) throws Exception {
        if (isDebtMoreThanLimit(creditCard)) {
            continueWithdrawFromCreditLimitDebt(creditCard, sum);
        } else {
            denyWithdraw();
        }
    }

    public void continueWithdrawFromCreditLimitDebt(CreditCard creditCard, double sum) throws Exception {
            creditCard.setCreditLimitDebt(creditCard.getCreditLimitDebt() + sum);
    }

    public boolean isDebtMoreThanLimit(CreditCard creditCard) {
        if (creditCard.getCreditLimitDebt() > creditCard.getCreditLimit()) {
            return true;
        } else {
            return false;
        }
    }


    public CreditCard createCard(long cardNumber, short pinCode) {
        return new CreditCard(cardNumber, pinCode);
    }
    public CreditCard changeCreditLimit(double limit, CreditCard creditCard) {
        creditCard.setCreditLimit(limit);
        return creditCard;
    }
}