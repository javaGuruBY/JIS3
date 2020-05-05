package by.jrr;

import by.jrr.bean.Product;
import by.jrr.service.ProductService;

public class App {
    public static void main(String[] args) {
        Product product = new Product("milk");
        ProductService productService = new ProductService();
        product.setDiscount(20);
        product.setRegularPrice(1);
        productService.setActualPrice(product);
        productService.printInformation(product);
    }
}
