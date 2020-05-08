package by.jrr.shop.service;

import by.jrr.shop.bean.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Product product1;
    Product product2;
    Shop shopTest;

    @BeforeEach
    void setUp() {
        product1 = new Product("Chicken", 7.45);
        product2 = new Product("Rice", 2.19);
        shopTest = new Shop();
    }

    @Test
    void addProductTest() {
        boolean expected = true;
        shopTest.addProduct(product1);
        boolean actual = shopTest.getShop().contains(product1);
        assertEquals(expected,actual, "[Error] not found this product");

    }

    @Test
    void deleteProductTest() {
        boolean expected = true;
        shopTest.addProduct(product1);
        shopTest.deleteProduct(product1);
        boolean actual = shopTest.getShop().isEmpty();
        assertEquals(expected, actual, "[ERROR] product not deleted");
    }

    @Test
    void findProductByNameTest() {
        shopTest.addProduct(product1);
        List<Product> list = new LinkedList<>();
        list.add(product1);
        String expected = list.toString();
        String actual = shopTest.findProductByName("Chicken");
        assertEquals(expected, actual, "[ERROR]: cant find this product");
    }

    @Test
    void findAllProductsThatAreInTheDigitalRangeTest() {
        shopTest.addProduct(product1);
        shopTest.addProduct(product2);
        List<Product> list = new LinkedList<>();
        list.add(product1);
        list.add(product2);
        String expected = list.toString();
        String actual = shopTest.findAllProductsThatAreInTheDigitalRange(2.00, 8.00);
        assertEquals(expected, actual, "[ERROR]");
    }
}