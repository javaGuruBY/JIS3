package by.bariloegor;

import by.bariloegor.bean.Product;
import by.bariloegor.service.ProductService;

public class ProductDemo {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Product firstProduct = new Product("Milk");
        Product secondProduct = new Product("Bread");

        firstProduct.setRegularPrice(1.98);
        firstProduct.setDiscount(3);
        productService.printInformation(firstProduct);

        secondProduct.setRegularPrice(0.98);
        secondProduct.setDiscount(2.5);
        productService.printInformation(secondProduct);
    }
}
