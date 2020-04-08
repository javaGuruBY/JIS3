package bean;

import java.io.Serializable;
import java.util.Objects;

public class Stock implements Serializable {
    private String name;
    private double price;
    private double minimalPrice;
    private double maximalPrice;

    public Stock() {
    }

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
        this.maximalPrice = price;
        this.minimalPrice = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMinimalPrice() {
        return minimalPrice;
    }

    public void setMinimalPrice(double minimalPrice) {
        this.minimalPrice = minimalPrice;
    }

    public double getMaximalPrice() {
        return maximalPrice;
    }

    public void setMaximalPrice(double maximalPrice) {
        this.maximalPrice = maximalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stock stock = (Stock) o;
        return Double.compare(stock.price, price) == 0 &&
                Double.compare(stock.minimalPrice, minimalPrice) == 0 &&
                Double.compare(stock.maximalPrice, maximalPrice) == 0 &&
                Objects.equals(name, stock.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, minimalPrice, maximalPrice);
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", minimalPrice=" + minimalPrice +
                ", maximalPrice=" + maximalPrice +
                '}';
    }
}
