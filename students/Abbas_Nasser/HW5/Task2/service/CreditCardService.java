package service;

import bean.CreditCard;

public class CreditCardService {

        public boolean withdraw(CreditCard creditCard, int pin, double moneyAmount){
            if (!pinIsCorrect(creditCard, pin)) {
                return false;
            }
            if (sufficientFunds(creditCard, moneyAmount)){
                creditCard.setBalance(creditCard.getBalance() - moneyAmount);
                return true;
            } else if (debtMoneyBalanced(creditCard, moneyAmount)){
                double moneyForDebt = moneyAmount - creditCard.getBalance();
                creditCard.setBalance(0);
                creditCard.setCreditDebt(creditCard.getCreditDebt() + moneyForDebt);
                return true;
            }
            return false;
        }

        public boolean deposit(CreditCard creditCard, int pin, double amount){
            if (!pinIsCorrect(creditCard, pin)) {
                return false;
            }
            if (!debtIsCleared(creditCard)){
                if (enoughMoneyToClearDebt(creditCard, amount)){
                    amount -= creditCard.getCreditDebt();
                    creditCard.setCreditDebt(0);
                } else {
                    creditCard.setCreditDebt(creditCard.getCreditDebt() - amount);
                    amount = 0;
                }
            }
            creditCard.setBalance(creditCard.getBalance() + amount);
            return true;
        }

        private boolean enoughMoneyToClearDebt(CreditCard creditCard, double amount) {
            return (creditCard.getCreditDebt() <= amount);
        }

        private boolean debtIsCleared(CreditCard creditCard) {
            return (creditCard.getCreditDebt() == 0);
        }

        private boolean debtMoneyBalanced (CreditCard creditCard, double amount) {
            double allAvailableMoney = creditCard.getBalance() + creditCard.getLimit() - creditCard.getCreditDebt();
            return (allAvailableMoney >= amount);
        }

        private boolean pinIsCorrect(CreditCard creditCard, int pin) {
            return (creditCard.getPin() == pin);
        }

        private boolean sufficientFunds(CreditCard creditCard, double amount) {
            return (creditCard.getBalance() >= amount);
        }
    }

