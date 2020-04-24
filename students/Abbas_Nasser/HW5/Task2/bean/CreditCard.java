package bean;

import java.util.Objects;

public class CreditCard {
    private long number;
    private int pin;
    private double Debt;
    private double balance;
    private int limit;


    public CreditCard(long number, int pin) {
        this.number = number;
        this.pin = pin;
        this.Debt = Debt = 0;
    }



    public CreditCard() {
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getCreditDebt() {
        return Debt;
    }

    public void setCreditDebt(double creditDebt) {
        this.Debt = creditDebt;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return number == that.number &&
                pin == that.pin &&
                Double.compare(that.Debt, Debt) == 0 &&
                Double.compare(that.balance, balance) == 0 &&
                limit == that.limit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, pin, Debt, balance, limit);
    }


    @Override
    public String toString() {
        return "CreditCard{" +
                "number=" + number +
                " pin=" + pin +
                " Debt=" + Debt +
                " balance=" + balance +
                " limit=" + limit +
                '}';
    }
}
