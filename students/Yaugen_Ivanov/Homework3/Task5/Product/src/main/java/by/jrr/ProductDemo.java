package by.jrr;

import by.jrr.bean.Product;
import by.jrr.service.ProductService;

public class ProductDemo {
    public static void main(String[] args) {
        Product name = new Product();
        ProductService service = new ProductService();
        service.printInformation(name);
    }
}
