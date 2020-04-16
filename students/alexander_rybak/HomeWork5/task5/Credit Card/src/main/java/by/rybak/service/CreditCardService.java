package by.rybak.service;

import by.rybak.bean.CreditCard;

public class CreditCardService {

    CreditCard card = new CreditCard("235234534345", "1111");

    public void deposit(CreditCard card, double desiredAmount, String pin) {
        if (pinIsTrue(pin)) {
            if (card.getLoanDebt() > 0) {
                if (desiredAmount >= card.getLoanDebt()) {
                    card.setBalance(card.getBalance() + desiredAmount - card.getLoanDebt());
                    card.setLoanDebt(0);
                } else {
                    card.setLoanDebt(card.getLoanDebt() - desiredAmount);
                }
            } else if (card.getLoanDebt() == 0) {
                card.setBalance(desiredAmount);
            }
        } else {
            System.out.println("pin is incorrect!");
        }
    }

    public void withdraw(CreditCard card, double desiredAmount, String pin) {
        if (pinIsTrue(pin)) {
            if (desiredAmount <= card.getBalance()) {
                card.setBalance(card.getBalance() - desiredAmount);
            } else if (desiredAmount >= (card.getBalance() + card.getLoanDebt())) {
                card.setLoanDebt(desiredAmount - card.getBalance());
                card.setBalance(0);
            } else {
                System.out.println("Operation is canceled!");
            }
        } else {
            System.out.println("pin is incorrect!");
        }
    }

    public boolean pinIsTrue(String pin) {
        if (pin.equals(card.getPin())) return true;
        else return false;
    }
}
