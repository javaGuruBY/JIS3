package by.jrr.service;

import by.jrr.bean.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductServiceTest {
    Product product;
    ProductService productService;

    @BeforeEach
    public void init(){
         product = new Product("Chicken", 8.0, 15.0);
         productService = new ProductService();
    }

    @Test
    void actualPrice() {
        double expectedPrice = 6.8;
        double actualPrice = productService.actualPrice(product);
        assertEquals(expectedPrice, actualPrice, "should return Chicken 8.0 eur 15% discount " +
                "and actual price 6.8 eur");
    }
}