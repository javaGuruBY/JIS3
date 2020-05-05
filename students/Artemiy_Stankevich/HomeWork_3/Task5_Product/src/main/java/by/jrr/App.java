package by.jrr;

import by.jrr.bean.Product;
import by.jrr.service.ProductService;

public class App {
    public static void main(String[] args) {
        Product product = new Product("Chicken", 8.0, 15.0);
        ProductService productService = new ProductService();
        productService.actualPrice(product);
        productService.printInformation(product);
    }
}
