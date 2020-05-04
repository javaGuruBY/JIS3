package by.jrr.service;

import by.jrr.bean.CreditCard;

public class CreditCardService {

    public boolean deposit(CreditCard creditCard, int pinCode, double desiredAmount){
        if (thePinCodeIsTrue(creditCard, pinCode)) {
            return false;
            }
            if (!debitBalanceCheck(creditCard)){
                if (checkingBalanceForRepaymentOfDebtOnDebitCard(creditCard, desiredAmount)){
                desiredAmount = desiredAmount - creditCard.getLoanDebt();
                creditCard.setLoanDebt(0);
                } else {
                creditCard.setLoanDebt(creditCard.getLoanDebt() - desiredAmount);
                desiredAmount = 0;
            }
        }
        creditCard.setBalanceCreditCard(creditCard.getBalanceCreditCard() + desiredAmount);
        return true;
    }


    public boolean withdraw(CreditCard creditCard, int pinCode, double desiredAmount){
        if (thePinCodeIsTrue(creditCard, pinCode)) {
            return false;
        }
        if (amountOfMoneyOnBalance(creditCard, desiredAmount)){
            creditCard.setBalanceCreditCard(creditCard.getBalanceCreditCard() - desiredAmount);
            return true;
        } else if (amountOfMoneyInBalanceWithDebts(creditCard, desiredAmount)){
            double takeMoneyFromDebit = desiredAmount - creditCard.getBalanceCreditCard();
            creditCard.setBalanceCreditCard(0);
            creditCard.setLoanDebt(creditCard.getLoanDebt() + takeMoneyFromDebit);
            return true;
        }

        return false;
    }

    private boolean thePinCodeIsTrue(CreditCard creditCard, int pinCode){
        return creditCard.getPinCodCreditCard() != pinCode;
    }

    private boolean checkingBalanceForRepaymentOfDebtOnDebitCard(CreditCard creditCard, double desiredAmount) {
        return (creditCard.getLoanDebt() <= desiredAmount);
    }

    private boolean debitBalanceCheck(CreditCard creditCard) {
        return creditCard.getLoanDebt() == 0;
    }

    private boolean amountOfMoneyInBalanceWithDebts(CreditCard creditCard, double desiredAmount) {
        double affordoubleMoney = creditCard.getBalanceCreditCard() + creditCard.getCreditLimit() - creditCard.getLoanDebt();
        return (affordoubleMoney >= desiredAmount);
    }

    private boolean amountOfMoneyOnBalance(CreditCard creditCard, double desiredAmount) {
        return (creditCard.getBalanceCreditCard() >= desiredAmount);
    }
}
