package com.javaguru.shoppinglist.service.validation;

import com.javaguru.shoppinglist.bean.Product;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ProductValidationServiceTest {
    private ProductValidationService service;
    private Product product;

    @Before
    public void setUp() throws Exception {
        service = new ProductValidationService();
        product = new Product();
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateIncorrectProduct() {
        product.setName("na");
        product.setPrice(new BigDecimal(100));
        product.setDiscount(new BigDecimal(10));
        service.validate(product);
    }

    @Test
    public void validate() {
        product.setName("name1");
        product.setPrice(new BigDecimal(100));
        product.setDiscount(new BigDecimal(10));
        service.validate(product);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateNullProduct() {
        service.validate(null);
    }
}