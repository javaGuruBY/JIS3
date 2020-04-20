package by.jrr.service;

import by.jrr.bean.Product;

public class ProductService {
    public double actualPrice(Product prod){
        return prod.getRegularPrice() - (prod.getRegularPrice() / 100 * prod.getDiscount());
    }

    public void printInformation(Product prod){
        System.out.println("Product : name = \"" + prod.getProduct()
                + "\", regular price = " + prod.getRegularPrice()
                + " EUR, discount = " + prod.getDiscount()
                + " %, actual price = " + actualPrice(prod) + " EUR");
    }
}
