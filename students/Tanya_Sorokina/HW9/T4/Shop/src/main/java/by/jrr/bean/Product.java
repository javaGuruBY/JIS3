package by.jrr.bean;
//Класс Product описывает наименование товара и его стоимость (BigDecimal).
//
//        Создать товар можно только с именем и стоимостью и свойства
//        не должны изменяться после создания обьекта.

import java.util.Objects;

public class Product {

    private String productName;
    private double productCost;

    public Product() {
    }

    public Product(String productName, double productCost) {
        this.productName = productName;
        this.productCost = productCost;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setProductCost(double productCost) {
        this.productCost = productCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product produkt = (Product) o;
        return Double.compare(produkt.productCost, productCost) == 0 &&
                Objects.equals(productName, produkt.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productCost);
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "productName='" + productName + '\'' +
                ", productCost=" + productCost +
                '}';
    }
}
