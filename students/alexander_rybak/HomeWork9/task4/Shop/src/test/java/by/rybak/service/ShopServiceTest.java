package by.rybak.service;

import by.rybak.bean.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {
    Product product;
    ShopService service;

    @BeforeEach
    void setUp() {
        service = new ShopService();
        product = new Product("Apple", new BigDecimal(5));
    }

    @Test
    void addProduct() {
        service.addProduct(product);
        Product expected = product;
        Product actual = service.findByName("Apple");

        assertEquals(expected, actual);
    }

    @Test
    void deleteProduct() {
        service.addProduct(product);
        Product expected = null;
        service.deleteProduct(product);
        Product actual = service.findByName("Apple");

        assertEquals(expected, actual);
    }

    @Test
    void findByName() {
        service.addProduct(product);
        Product expected = product;
        Product actual = service.findByName("Apple");

        assertEquals(expected, actual);
    }

    @Test
    void findProduct() {
        service.addProduct(product);
        ArrayList<Product> expected = new ArrayList<>();
        expected.add(product);
        ArrayList<Product> actual = service.findProduct(new BigDecimal(3), new BigDecimal(7));

        assertEquals(expected.get(0), actual.get(0));
    }
}