package by.jrr.bean;

import java.util.Objects;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;


    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }



    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.getRegularPrice(), getRegularPrice()) == 0 &&
                Double.compare(product.getDiscount(), getDiscount()) == 0 &&

                Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRegularPrice(), getDiscount());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", regularPrice=" + regularPrice +
                ", discount=" + discount +
                '}';
    }
}
