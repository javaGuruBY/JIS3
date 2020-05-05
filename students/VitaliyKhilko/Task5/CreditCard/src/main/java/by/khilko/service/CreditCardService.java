package by.khilko.service;

import by.khilko.bean.CreditCard;

public class CreditCardService {


    public boolean deposit(CreditCard card, int pin, double money){
        if (correctPincode(card, pin)) {
            return false;
        }
        if (!debitBalanceCheck(card)){
            if (checkingBalanceForRepaymentOfDebtOnDebitCard(card, money)){
                money = money - card.getDept();
                card.setDept(0);
            } else {
                card.setDept(card.getDept() - money);
                money = 0;
            }
        }
        card.setBalance(card.getBalance() + money);
        return true;
    }


    public boolean withdraw(CreditCard card, int pin, double money){
        if (correctPincode(card, pin)) {
            return false;
        }
        if (amountOfMoneyOnBalance(card, money)){
            card.setBalance(card.getBalance() - money);
            return true;
        } else if (amountOfMoneyInBalanceWithDebts(card, money)){
            double takeMoneyFromDebit = money - card.getBalance();
            card.setBalance(0);
            card.setDept(card.getDept() + takeMoneyFromDebit);
            return true;
        }
        return false;
    }


    private boolean correctPincode(CreditCard card, int pin) {
        return card.getPinCode() != pin;
    }

    private boolean checkingBalanceForRepaymentOfDebtOnDebitCard(CreditCard card, double money) {
        return (card.getDept() <= money);
    }

    private boolean debitBalanceCheck(CreditCard card) {
        return card.getDept() == 0;
    }

    private boolean amountOfMoneyInBalanceWithDebts(CreditCard card, double money) {
        double affordableMoney = card.getBalance() + card.getCreditLimit() - card.getDept();
        return (affordableMoney >= money);
    }

    private boolean amountOfMoneyOnBalance(CreditCard card, double money) {
        return (card.getBalance() >= money);
    }
}
