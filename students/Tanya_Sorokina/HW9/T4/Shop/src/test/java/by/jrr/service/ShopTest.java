package by.jrr.service;

import by.jrr.bean.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Product productTest1;
    Product productTest2;
    Shop shopTest;

    @BeforeEach
    void setUp(){
        productTest1 = new Product("Cosmo", 3.35);
        productTest2 = new Product("Oranges", 5.99);
        shopTest = new Shop();
    }

    @Test
    void addProductTest() {
        boolean expected = true;
        shopTest.addProduct(productTest1);
        boolean actual = shopTest.getShop().contains(productTest1);
        assertEquals(expected, actual, "[ERROR] product not add");
    }

    @Test
    void deleteProductTest() {
        boolean expected = true;
        shopTest.addProduct(productTest2);
        shopTest.deleteProduct(productTest2);
        boolean actual = shopTest.getShop().isEmpty();
        assertEquals(expected, actual, "[ERROR] product not delete");
    }

    @Test
    void findProductByNameTest() {
        shopTest.addProduct(productTest1);
        List<Product> testList = new ArrayList<>();
        testList.add(productTest1);
        String expected = testList.toString();
        String actual = shopTest.findProductByName("Cosmo");
        assertEquals(expected, actual, "[ERROR] product not find");
    }

    @Test
    void findAllProductsInThePriceRangeTest() {
        shopTest.addProduct(productTest1);
        shopTest.addProduct(productTest2);
        List<Product> testList2 = new ArrayList<>();
        testList2.add(productTest1);
        testList2.add(productTest2);
        String expected = "[Produkt{productName='Oranges', productCost=5.99}]";
        String actual = shopTest.findAllProductsInThePriceRange(4, 10);
        assertEquals(expected, actual, "[ERROR] product not find");
    }
}