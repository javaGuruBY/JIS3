package by.jrr.service;

import by.jrr.bean.Product;

public class ProductService {
    public double setActualPrice(Product product){
        return product.getRegularPrice() - (product.getRegularPrice() * product.getDiscount() / 100);
    }
    public void printInformation(Product product){
        System.out.println("Product : name = \"" + product.getName()
                + "\", regular price = " + product.getRegularPrice()
                + " EUR, discount = " + product.getDiscount()
                + "%, actual price = " + this.setActualPrice(product) + " EUR");
    }
}
