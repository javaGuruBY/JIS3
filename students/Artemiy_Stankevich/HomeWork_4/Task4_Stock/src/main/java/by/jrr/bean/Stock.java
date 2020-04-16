package by.jrr.bean;

import java.io.Serializable;
import java.util.Objects;

public class Stock implements Serializable {
    private String nameCompany;
    private double currentValue;
    private double minCost;
    private double maxCost;

    public Stock() {
    }

    public Stock(String nameCompany, double currentValue) {
        this.nameCompany = nameCompany;
        this.currentValue = currentValue;
        this.maxCost = currentValue;
        this.minCost = currentValue;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(double currentValue) throws Exception {
        if (currentValue <=0) {
            throw new Exception("variable price must be greater than zero");
        }this.currentValue = currentValue;

    }

    public double getMinCost() {
        return minCost;
    }

    public void setMinCost(double minCost) {
        this.minCost = minCost;
    }

    public double getMaxCost() {
        return maxCost;
    }

    public void setMaxCost(double maxCost) {
        this.maxCost = maxCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.currentValue, currentValue) == 0 &&
                Double.compare(stock.minCost, minCost) == 0 &&
                Double.compare(stock.maxCost, maxCost) == 0 &&
                Objects.equals(nameCompany, stock.nameCompany);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCompany, currentValue, minCost, maxCost);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "nameCompany='" + nameCompany + '\'' +
                ", currentValue=" + currentValue +
                ", minCost=" + minCost +
                ", maxCost=" + maxCost +
                '}';
    }
}
