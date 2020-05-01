package by.bariloegor.service;

import by.bariloegor.bean.Product;
import by.bariloegor.repository.Storage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ShopTest {
    private Shop shop;

    @Before
    public void setUp() {
        shop = new Shop();
    }

    @Test
    public void addProductTest() {
        boolean[] expected = {true, true};
        Product[] products = {new Product("Milk", BigDecimal.valueOf(2.5)),
                new Product("Bread,", BigDecimal.valueOf(3.0))};
        for(int i = 0; i < expected.length; i++){
            shop.addProduct(products[i]);
            boolean actual = Storage.shopStorage.contains(products[i]);
            assertEquals("Should add product", expected[i], actual);
        }
    }

    @Test
    public void removeProductTest() {
        boolean[] expected = { false, false};
        Product[] products = { new Product("Milk", BigDecimal.valueOf(2.5)),
                new Product("Bread,", BigDecimal.valueOf(3.0))};
        for(int i = 0; i < expected.length; i++){
            Storage.shopStorage.add(products[i]);
            shop.removeProduct(products[i]);
            boolean actual = Storage.shopStorage.contains(products[i]);
            assertEquals("Should remove product", expected[i], actual);
        }
    }

    @Test
    public void findProductTest() {
        Product[] expected = {new Product("Milk", BigDecimal.valueOf(2.5)),
                new Product("Bread", BigDecimal.valueOf(3.0))};
        Product[] products = {new Product("Milk", BigDecimal.valueOf(2.5)),
                new Product("Bread", BigDecimal.valueOf(3.0))};
        String[] productNames = {"Milk", "Bread"};

        for(int i = 0; i < expected.length; i++){
            Storage.shopStorage.add(products[i]);
            Product actual = shop.findProduct(productNames[i]);
            assertEquals("Should find product", expected[i], actual);
        }
    }

    @Test
    public void productInRangeTest() {
        Product[] products = {new Product("Milk", BigDecimal.valueOf(2.5)),
                new Product("Bread", BigDecimal.valueOf(3.0)),
                new Product("Salt", BigDecimal.valueOf(0.5)),
                new Product("Choco", BigDecimal.valueOf(4.0))};
        Storage.shopStorage.addAll(Arrays.asList(products));

        String expected = "[Product{name='Milk', price=2.5}, Product{name='Bread', price=3.0}]";

        String actual = shop.productInRange(BigDecimal.valueOf(2.4), BigDecimal.valueOf(3.1)).toString();
        assertEquals("Should return products in range", expected, actual);
    }

    @After
    public void tearDown(){
        Storage.shopStorage.clear();
    }
}