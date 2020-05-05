package by.mmkle.service;

import by.mmkle.bean.Product;
import by.mmkle.repository.Shop;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {
    private ShopService service;

    @BeforeEach
    void setUp(){
        service = new ShopService();
        Shop.stock.clear();
    }

    @Test
    void add() {
        String testMessage = "Should add product";
        String[] expected = {
                "[Product{name='product1', price=5}]",
                "[Product{name='product1', price=5}, Product{name='product2', price=10}]",

        };
        Product[] products = {
                new Product("product1", new BigDecimal(5)),
                new Product("product2", new BigDecimal(10))
        };

        for (int i = 0; i < expected.length; i++){
            service.add(products[i]);
            String actual = Shop.stock.toString();
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void remove() {
        String testMessage = "Should remove product";
        String[] expected = {
                "[Product{name='product2', price=10}]",
                "[]",

        };
        Product[] products = {
                new Product("product1", new BigDecimal(5)),
                new Product("product2", new BigDecimal(10))
        };

        for (Product product : products){
            service.add(product);
        }

        for (int i = 0; i < expected.length; i++){
            service.remove(products[i]);
            String actual = Shop.stock.toString();
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void findByName() {
        String testMessage = "Should find product by name";
        Product[] expected = {
                new Product("product1", new BigDecimal(5)),
                new Product("product2", new BigDecimal(10))
        };
        Product[] products = {
                new Product("product1", new BigDecimal(5)),
                new Product("product2", new BigDecimal(10))
        };

        for (Product product : products){
            service.add(product);
        }

        for (int i = 0; i < expected.length; i++){
            Product actual = service.findByName(products[i].getName());
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void productsInRange() {
        String testMessage = "Should return all products in range";
        String[] expected = {
                "[Product{name='product1', price=5}, Product{name='product2', price=10}]",
                "[Product{name='product2', price=10}]"
        };
        Product[] products = {
                new Product("product1", new BigDecimal(5)),
                new Product("product2", new BigDecimal(10))
        };

        BigDecimal[] leftRange = {
            new BigDecimal(1),
            new BigDecimal(7)
        };

        BigDecimal[] rightRange = {
                new BigDecimal(10),
                new BigDecimal(10)
        };

        for (Product product : products){
            service.add(product);
        }

        for (int i = 0; i < expected.length; i++){
            String actual = service.productsInRange(leftRange[i], rightRange[i]).toString();
            assertEquals(expected[i], actual, testMessage);
        }
    }
}