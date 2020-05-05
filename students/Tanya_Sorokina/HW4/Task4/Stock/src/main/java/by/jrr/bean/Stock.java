package by.jrr.bean;
import java.io.Serializable;
import java.util.Objects;


public class Stock implements Serializable {
    private String companyName;
    private double currentValue;
    private double minimumPrice;
    private double maximumPrice;
    private double correctPrice;

    public Stock() {
    }

    public Stock(String companyName, double stockPrice) {
        this.companyName = companyName;
        this.currentValue = stockPrice;
        this.maximumPrice = stockPrice;
        this.minimumPrice = stockPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) {
        this.currentValue = currentValue;
    }

    public double getMinimumPrice() {
        return minimumPrice;
    }

    public void setMinimumPrice(double correctPrice) {
        this.minimumPrice = minimumPrice;
    }

    public double getMaximumPrice() {
        return maximumPrice;
    }

    public void setMaximumPrice(double maximumPrice) {
        this.maximumPrice = maximumPrice;
    }

    public double getCorrectPrice() {
        return correctPrice;
    }

    public void setCorrectPrice(double correctPrice) {
        this.correctPrice = correctPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.currentValue, currentValue) == 0 &&
                Double.compare(stock.minimumPrice, minimumPrice) == 0 &&
                Double.compare(stock.maximumPrice, maximumPrice) == 0 &&
                Double.compare(stock.correctPrice, correctPrice) == 0 &&
                Objects.equals(companyName, stock.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyName, currentValue, minimumPrice, maximumPrice, correctPrice);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "companyName='" + companyName + '\'' +
                ", currentValue=" + currentValue +
                ", minimumPrice=" + minimumPrice +
                ", maximumPrice=" + maximumPrice +
                ", correctPrice=" + correctPrice +
                '}';
    }
}