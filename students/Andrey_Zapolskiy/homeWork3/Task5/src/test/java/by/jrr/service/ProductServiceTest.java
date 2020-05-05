package by.jrr.service;

import by.jrr.bean.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void actualPrice() {

        Product product = new Product("milk");
        ProductService productService = new ProductService();
        product.setRegularPrice(1);
        product.setDiscount(20);
        double expectedPrice = 0.8;

        double actualPrice = productService.setActualPrice(product);
        assertEquals(expectedPrice, actualPrice, "should return milk 1 eur 20% discount and actual price 0.8 eur");
    }
}