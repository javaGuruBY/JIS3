package by.jrr;

import by.jrr.bean.Product;
import by.jrr.servise.ProductService;

public class App{

    public static void main(String[] args) {
        Product product = new Product("Samsung S9", 500, 20);
        ProductService productService = new ProductService();
        productService.actualPrice(product);
        productService.printInfo(product);
    }
}