package com.javaguru.shoppinglist.service;

import com.javaguru.shoppinglist.bean.Category;
import com.javaguru.shoppinglist.bean.Product;
import com.javaguru.shoppinglist.bean.ShopingCart;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShopingCartServiceTest {

    private Product product;
    private ShopingCart shopingCart;
    private ShopingCartService service;

    @Before
    public void setUp() throws Exception {
        shopingCart = new ShopingCart();
        service = new ShopingCartService();
        product = new Product("name", new BigDecimal(100), new BigDecimal(10), Category.SOME_CATEGORY, "description");
    }


    @Test
    public void addProductToCart() {
        service.addProductToCart(shopingCart, product);
        List<Product> expected = new ArrayList<>();
        expected.add(product);
        List<Product> actual = shopingCart.getProductList();
        assertEquals("Should add product to list", expected, actual);
    }

    @Test
    public void getProductList() {
        service.addProductToCart(shopingCart, product);
        List<Product> expected = new ArrayList<>();
        expected.add(product);
        List<Product> actual = service.getProductList(shopingCart);
        assertEquals("Should return product list", expected, actual);
    }

    @Test
    public void getPriceOfAllProducts() {
        service.addProductToCart(shopingCart, product);
        BigDecimal expected = new BigDecimal(90);
        BigDecimal actual = service.getPriceOfAllProducts(shopingCart);
        assertTrue("Should return product list", expected.compareTo(actual) == 0);

    }
}