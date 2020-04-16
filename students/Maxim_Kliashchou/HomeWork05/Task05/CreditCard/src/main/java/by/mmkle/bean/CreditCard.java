package by.mmkle.bean;

import java.io.Serializable;
import java.util.Objects;

public class CreditCard implements Serializable {
    private String number;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double creditDebt;

    public CreditCard() {
    }

    public CreditCard(String number, int pinCode) {
        this.number = number;
        this.pinCode = pinCode;
        balance = creditDebt = 0;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
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

    public double getCreditDebt() {
        return creditDebt;
    }

    public void setCreditDebt(double creditDebt) {
        this.creditDebt = creditDebt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return pinCode == that.pinCode &&
                Double.compare(that.balance, balance) == 0 &&
                Double.compare(that.creditLimit, creditLimit) == 0 &&
                Double.compare(that.creditDebt, creditDebt) == 0 &&
                Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, pinCode, balance, creditLimit, creditDebt);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number='" + number + '\'' +
                ", pinCode=" + pinCode +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", creditDebt=" + creditDebt +
                '}';
    }
}
