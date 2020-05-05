package org.example;

import org.example.bean.Product;
import org.example.service.ProductService;

public class App {
    public static void main(String[] args) {
        Product product = new Product("Milk", 2, 0.20);
        ProductService productService = new ProductService();
        productService.printlnformation(product);
    }

}
