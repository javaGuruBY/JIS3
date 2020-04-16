package by.mmkle.service;

import by.mmkle.bean.CreditCard;

public class CreditCardService {
    public boolean withdraw(CreditCard creditCard, int pinCode, double moneyAmount){
        if (!isPinCodeCorrect(creditCard, pinCode)) {
            return false;
        }
        if (isEnoughMoneyOnBalance(creditCard, moneyAmount)){
            creditCard.setBalance(creditCard.getBalance() - moneyAmount);
            return true;
        } else if (isEnoughMoneyOnBalanceWithDebt(creditCard, moneyAmount)){
            double moneyForDebt = moneyAmount - creditCard.getBalance();
            creditCard.setBalance(0);
            creditCard.setCreditDebt(creditCard.getCreditDebt() + moneyForDebt);
            return true;
        }
        return false;
    }

    public boolean deposit(CreditCard creditCard, int pinCode, double moneyAmount){
        if (!isPinCodeCorrect(creditCard, pinCode)) {
            return false;
        }
        if (!isDeptPaidOff(creditCard)){
            if (isEnoughMoneyToPaidOffDebt(creditCard, moneyAmount)){
                moneyAmount -= creditCard.getCreditDebt();
                creditCard.setCreditDebt(0);
            } else {
                creditCard.setCreditDebt(creditCard.getCreditDebt() - moneyAmount);
                moneyAmount = 0;
            }
        }
        creditCard.setBalance(creditCard.getBalance() + moneyAmount);
        return true;
    }

    private boolean isEnoughMoneyToPaidOffDebt(CreditCard creditCard, double moneyAmount) {
        return (creditCard.getCreditDebt() <= moneyAmount);
    }

    private boolean isDeptPaidOff(CreditCard creditCard) {
        return (creditCard.getCreditDebt() == 0);
    }

    private boolean isEnoughMoneyOnBalanceWithDebt(CreditCard creditCard, double moneyAmount) {
        double allAvailableMoney = creditCard.getBalance() + creditCard.getCreditLimit() - creditCard.getCreditDebt();
        return (allAvailableMoney >= moneyAmount);
    }

    private boolean isPinCodeCorrect(CreditCard creditCard, int pinCode) {
        return (creditCard.getPinCode() == pinCode);
    }

    private boolean isEnoughMoneyOnBalance(CreditCard creditCard, double moneyAmount) {
        return (creditCard.getBalance() >= moneyAmount);
    }
}
