package by.abs.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    private ShopService service;

    @BeforeEach
    void setUp() {
    service = new ShopService();
    Shop.stock.clear();
    }

    @Test
    void mustAdd() {
        String[] expected = {
                "[Products{name='milk', price=3}]",
                "[Products{name='milk', price=3}, Products{name='cheese', price=6}]"};
        Products[] products = {
                new Products("milk", new BigDecimal(3)),
                new Products("cheese", new BigDecimal(6))};

        for (int i = 0; i < expected.length; i++){
            service.add(products[i]);
            String actual = Shop.stock.toString();
            assertEquals(expected[i], actual);
        }
    }

    @Test
    void mustRemove() {
        String[] expected = {
                "[Products{name='cheese', price=6}]",
                "[]"};
        Products[] products = {
                new Products("milk", new BigDecimal(3)),
                new Products("cheese", new BigDecimal(6))};

        for (Products product : products){
            service.add(product);
        }

        for (int i = 0; i < expected.length; i++){
            service.remove(products[i]);
            String actual = Shop.stock.toString();
            assertEquals(expected[i], actual);
        }
    }

    @Test
    void findByName() {
        Products[] expected = {
                new Products("milk", new BigDecimal(3)),
                new Products("cheese", new BigDecimal(6))};
        Products[] products = {
                new Products("milk", new BigDecimal(3)),
                new Products("cheese", new BigDecimal(6))};


        for (Products product : products){
            service.add(product);
        }

        for (int i = 0; i < expected.length; i++){
            Products actual = service.findByName(products[i].getName());
            assertEquals(expected[i], actual);
        }
    }

    @Test
    void productsInRange() {
        String[] expected = {
                "[Products{name='milk', price=3}, Products{name='cheese', price=6}]",
                "[Products{name='cheese', price=6}]"};
        Products[] products = {
                new Products("milk", new BigDecimal(3)),
                new Products("cheese", new BigDecimal(6))};

        BigDecimal[] leftRange = {
                new BigDecimal(2),
                new BigDecimal(5)};

        BigDecimal[] rightRange = {
                new BigDecimal(12),
                new BigDecimal(11)};

        for (Products product : products){
            service.add(product);
        }

        for (int i = 0; i < expected.length; i++){
            String actual = service.productsInRange(leftRange[i], rightRange[i]).toString();
            assertEquals(expected[i], actual);
        }
    }
}