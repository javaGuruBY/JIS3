package by.jrr.bean;

import java.io.Serializable;
import java.util.Objects;

public class Stock implements Serializable {
    private String companyName;
    private double currentPrice;
    private double minimalPrice;
    private double maximumPrice;

    public Stock(String companyName, double currentPrice, double minimalPrice, double maximumPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minimalPrice = minimalPrice;
        this.maximumPrice = maximumPrice;
    }

    public Stock(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Stock() {
    }

    public Stock(String companyName, double currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.maximumPrice = currentPrice;
        this.minimalPrice = currentPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getMinimalPrice() {
        return minimalPrice;
    }

    public double getMaximumPrice() {
        return maximumPrice;
    }
    public void setMinimalPrice(double minimalPrice) {
        this.minimalPrice = minimalPrice;
    }

    public void setMaximumPrice(double maximumPrice) {
        this.maximumPrice = maximumPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.getCurrentPrice(), getCurrentPrice()) == 0 &&
                Double.compare(stock.getMinimalPrice(), getMinimalPrice()) == 0 &&
                Double.compare(stock.getMaximumPrice(), getMaximumPrice()) == 0 &&
                Objects.equals(getCompanyName(), stock.getCompanyName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCompanyName(), getCurrentPrice(), getMinimalPrice(), getMaximumPrice());
    }

    @Override
    public String toString() {
        return "Stock{" +
                "companyName='" + companyName + '\'' +
                ", currentPrice=" + currentPrice +
                ", minimalPrice=" + minimalPrice +
                ", maximumPrice=" + maximumPrice +
                '}';
    }


}
