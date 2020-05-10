package by.bariloegor.bean;

import java.io.Serializable;
import java.util.Objects;

public class Stock implements Serializable{
    private String name;
    private double actualPrice;
    private double minPrice;
    private double maxPrice;

    public Stock() {
    }

    public Stock(String name, double actualPrice) {
        this.name = name;
        this.actualPrice = actualPrice;
        this.maxPrice = actualPrice;
        this.minPrice = actualPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(double minPrice) {
        this.minPrice = minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(double maxPrice) {
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.actualPrice, actualPrice) == 0 &&
                Double.compare(stock.minPrice, minPrice) == 0 &&
                Double.compare(stock.maxPrice, maxPrice) == 0 &&
                Objects.equals(name, stock.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, actualPrice, minPrice, maxPrice);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", actualPrice=" + actualPrice +
                ", minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                '}';
    }
}
