package by.bariloegor.creditcard.service;

import by.bariloegor.creditcard.bean.CreditCard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreditCardService {
    Logger log = LoggerFactory.getLogger(CreditCardService.class);

    public void deposit(CreditCard creditCard, int pin, double sum){
        if(isPinCodeRight(creditCard, pin)) {
            proceedDeposit(creditCard,sum);
        } else {
            String creditCardInfo = creditCard.toString();
            log.error(creditCardInfo);
            throw new IllegalArgumentException("Illegal operation.Put right pin-code.");
        }
    }

    public void proceedDeposit(CreditCard creditCard, double sum){
        if(creditCard.getDept() == 0){
            creditCard.setBalance(creditCard.getBalance() + sum);
        } else {
            depositWithDeptRepayment(creditCard, sum);
        }
    }

    public boolean isSumMoreThanDept(CreditCard creditCard, double sum){
        return sum > creditCard.getDept();
    }

    public void depositWithDeptRepayment(CreditCard creditCard, double sum){
        if(isSumMoreThanDept(creditCard, sum)){
            double sumToBalance = sum - creditCard.getDept();
            creditCard.setDept(0);
            creditCard.setBalance(sumToBalance);
        } else {
            creditCard.setDept(creditCard.getDept() - sum);
        }
    }

    public boolean isSumLessThanBalance(CreditCard creditCard, double sum){
        return creditCard.getBalance() >= sum;
    }

    public void withdrawFromBalance(CreditCard creditCard, double sum){
        creditCard.setBalance(creditCard.getBalance() - sum);
    }

    public boolean isNewDeptMoreThanCreditLimit(CreditCard creditCard, double newDept){
        return newDept > creditCard.getCreditLimit();
    }

    public void withdrawFromDept(CreditCard creditCard, double sum){
        double sumOfDept = sum - creditCard.getBalance();
        double newDept = creditCard.getDept() + sumOfDept;
        if(!isNewDeptMoreThanCreditLimit(creditCard,newDept)){
            creditCard.setBalance(0);
            creditCard.setDept(newDept);
        } else {
            String creditCardInfo = creditCard.toString();
            log.error(creditCardInfo);
            throw new IllegalArgumentException("Dept cant be more than credit limit.");
        }
    }

    public void proceedWithdraw(CreditCard creditCard, double sum){
        if(isSumLessThanBalance(creditCard, sum)){
            withdrawFromBalance(creditCard, sum);
        } else {
            withdrawFromDept(creditCard, sum);
        }
    }

    public void withdraw(CreditCard creditCard, int pin, double sum){
        if(isPinCodeRight(creditCard, pin)) {
            proceedWithdraw(creditCard, sum);
        } else {
            String creditCardInfo = creditCard.toString();
            log.error(creditCardInfo);
            throw new IllegalArgumentException("Illegal operation.Put right pin-code.");
        }
    }

    public boolean isPinCodeRight(CreditCard creditCard, int pin){
        return creditCard.getPinCode() == pin;
    }

    public CreditCard createCard(long number, int pinCode){
        return new CreditCard(number, pinCode);
    }

    public void changeCreditLimit(CreditCard creditCard, double creditLimit){
        creditCard.setCreditLimit(creditLimit);
    }
}
