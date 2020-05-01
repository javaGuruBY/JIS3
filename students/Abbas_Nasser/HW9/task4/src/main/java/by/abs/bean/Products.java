package by.abs.bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Products {

    private String name;
    private BigDecimal price;

    public Products(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Products() {
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(name, products.name) &&
                Objects.equals(price, products.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
