package by.bariloegor.creditcard.bean;

import java.io.Serializable;
import java.util.Objects;

public class CreditCard implements Serializable {
    private long number;
    private int pinCode;
    private double balance;
    private double creditLimit;
    private double dept;

    public CreditCard() {
    }

    public CreditCard(long number, int pinCode) {
        this.number = number;
        this.pinCode = pinCode;
        this.balance = 0;
        this.dept = 0;
        this.creditLimit = 0;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
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

    public double getDept() {
        return dept;
    }

    public void setDept(double dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return number == that.number &&
                pinCode == that.pinCode &&
                Double.compare(that.balance, balance) == 0 &&
                Double.compare(that.creditLimit, creditLimit) == 0 &&
                Double.compare(that.dept, dept) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, pinCode, balance, creditLimit, dept);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + number +
                ", pinCode=" + pinCode +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", dept=" + dept +
                '}';
    }
}
