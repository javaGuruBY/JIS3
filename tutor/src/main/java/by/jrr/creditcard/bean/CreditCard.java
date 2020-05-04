package by.jrr.creditcard.bean;

import java.io.Serializable;
import java.util.Objects;

public class CreditCard implements Serializable {

    private long cardNumber;
    private short pin;
    private double balance = 0.0;
    private double creditLimit;
    private double debt = 0.0;

    public CreditCard() {

    }

    public CreditCard(long cardNumber, short pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    // TODO: 17/04/20 replace by builder
    public CreditCard(double balance,double creditLimit,double debt, short pin) {
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.debt = debt;
        this.pin = pin;
    }


    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public short getPin() {
        return pin;
    }

    public void setPin(short pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return cardNumber == that.cardNumber &&
                pin == that.pin &&
                Double.compare(that.balance, balance) == 0 &&
                Double.compare(that.creditLimit, creditLimit) == 0 &&
                Double.compare(that.debt, debt) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, pin, balance, creditLimit, debt);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", pin=" + pin +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", debt=" + debt +
                '}';
    }
}
