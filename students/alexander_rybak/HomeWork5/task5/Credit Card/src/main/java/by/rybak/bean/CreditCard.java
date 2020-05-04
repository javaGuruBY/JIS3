package by.rybak.bean;

import java.io.Serializable;
import java.util.Objects;

public class CreditCard implements Serializable {
    private String cardNumber;
    private String pin;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    public CreditCard() {
    }

    public CreditCard(String cardNumber, String pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = 0;
        this.loanDebt = 0;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
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

    public double getLoanDebt() {
        return loanDebt;
    }

    public void setLoanDebt(double loanDebt) {
        this.loanDebt = loanDebt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return Double.compare(that.balance, balance) == 0 &&
                Double.compare(that.creditLimit, creditLimit) == 0 &&
                Double.compare(that.loanDebt, loanDebt) == 0 &&
                Objects.equals(cardNumber, that.cardNumber) &&
                Objects.equals(pin, that.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, pin, balance, creditLimit, loanDebt);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber='" + cardNumber + '\'' +
                ", pin='" + pin + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", loanDebt=" + loanDebt +
                '}';
    }
}
