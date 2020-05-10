package by.bariloegor.service;

import by.bariloegor.bean.Product;

public class ProductService {
    private double actualPrice(Product product){
        return product.getRegularPrice() - ((product.getRegularPrice() / 100) * product.getDiscount());
    }

    public void printInformation(Product product){
        System.out.println("Product name: " + product.getName() + ", regular price: " + product.getRegularPrice() +
                ", discount: " + product.getDiscount() + ", actual price: " + actualPrice(product));
    }
}
