package by.jrr.shop.bean;

import java.io.Serializable;
import java.util.Objects;

public class Product implements Serializable {
    private String nameProduct;
    private double cost;

    public Product() {
    }

    public Product(String nameProduct, double cost) {
        this.nameProduct = nameProduct;
        this.cost = cost;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.cost, cost) == 0 &&
                Objects.equals(nameProduct, product.nameProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProduct, cost);
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameProduct='" + nameProduct + '\'' +
                ", cost=" + cost +
                '}';
    }
}
