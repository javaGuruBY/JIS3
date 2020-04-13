package org.example.service;

import org.example.bean.Product;

public class ProductService {
    public double actualPrice(Product product){
        return product.getRegularPrice() - (product.getRegularPrice()*product.getDiscount());


    }
    public void printlnformation(Product product){
        System.out.println("Name = " + product.getName()
                + ", regular price = " + product.getRegularPrice()
                + " EUR, discount = " + product.getDiscount()
                + " %, actual price = " + actualPrice(product) + " EUR");
    }
}
