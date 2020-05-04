package by.jrr.bean;
import java.io.Serializable;
import java.util.Objects;

public class CreditCard implements Serializable {
    private long numberCreditCard;
    private int pinCodCreditCard;
    private double balanceCreditCard;
    private double creditLimit;
    private double LoanDebt;

    public CreditCard() {
    }

    public CreditCard(long numberCreditCard, int pinCodCreditCard) {
        this.numberCreditCard = numberCreditCard;
        this.pinCodCreditCard = pinCodCreditCard;
        this.balanceCreditCard = 0;
        this.LoanDebt = 0;
    }

    public long getNumberCreditCard() {
        return numberCreditCard;
    }

    public void setNumberCreditCard(long numberCreditCard) {
        this.numberCreditCard = numberCreditCard;
    }

    public int getPinCodCreditCard() {
        return pinCodCreditCard;
    }

    public void setPinCodCreditCard(int pinCodCreditCard) {
        this.pinCodCreditCard = pinCodCreditCard;
    }

    public double getBalanceCreditCard() {
        return balanceCreditCard;
    }

    public void setBalanceCreditCard(double balanceCreditCard) {
        this.balanceCreditCard = balanceCreditCard;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getLoanDebt() {
        return LoanDebt;
    }

    public void setLoanDebt(double loanDebt) {
        LoanDebt = loanDebt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return numberCreditCard == that.numberCreditCard &&
                pinCodCreditCard == that.pinCodCreditCard &&
                Double.compare(that.balanceCreditCard, balanceCreditCard) == 0 &&
                Double.compare(that.creditLimit, creditLimit) == 0 &&
                Double.compare(that.LoanDebt, LoanDebt) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberCreditCard, pinCodCreditCard, balanceCreditCard, creditLimit, LoanDebt);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "numberCreditCard=" + numberCreditCard +
                ", pinCodCreditCard=" + pinCodCreditCard +
                ", balanceCreditCard=" + balanceCreditCard +
                ", creditLimit=" + creditLimit +
                ", LoanDebt=" + LoanDebt +
                '}';
    }
}
