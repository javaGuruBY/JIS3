package by.jrr.servise;

import by.jrr.bean.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceTest {

    @Test
    void actualPrice() {
        Product product = new Product("PS4", 500, 20);
        ProductService productService = new ProductService();
        double expected = 400.0;
        double actual = productService.actualPrice(product);
        assertEquals(expected, actual, "[Error]");
    }
}