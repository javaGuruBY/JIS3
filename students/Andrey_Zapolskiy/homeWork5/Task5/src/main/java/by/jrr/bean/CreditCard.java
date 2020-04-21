package by.jrr.bean;

import java.util.Objects;

public class CreditCard {
    private long cardNumber;
    private short pinCode;
    private double balanceAccount = 0.00;
    private double creditLimit;
    private double creditLimitDebt = 0.00;

    public CreditCard() {
    }

    public CreditCard(double balanceAccount, double creditLimit, double creditLimitDebt, short pinCode) {
        this.balanceAccount = balanceAccount;
        this.creditLimit = creditLimit;
        this.creditLimitDebt = creditLimitDebt;
        this.pinCode = pinCode;
    }

    public CreditCard(long cardNumber, short pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public short getPinCode() {
        return pinCode;
    }

    public void setPinCode(short pinCode) {
        this.pinCode = pinCode;
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }

    public void setBalanceAccount(double balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getCreditLimitDebt() {
        return creditLimitDebt;
    }

    public void setCreditLimitDebt(double creditLimitDebt) {
        this.creditLimitDebt = creditLimitDebt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return cardNumber == that.cardNumber &&
                pinCode == that.pinCode &&
                Double.compare(that.balanceAccount, balanceAccount) == 0 &&
                Double.compare(that.creditLimit, creditLimit) == 0 &&
                Double.compare(that.creditLimitDebt, creditLimitDebt) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber, pinCode, balanceAccount, creditLimit, creditLimitDebt);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", pinCode=" + pinCode +
                ", balanceAccount=" + balanceAccount +
                ", creditLimit=" + creditLimit +
                ", creditLimitDebt=" + creditLimitDebt +
                '}';
    }
}
