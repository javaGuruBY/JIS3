package com.javaguru.shoppinglist.service.validation;

import com.javaguru.shoppinglist.bean.Product;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProductNameValidationRuleTest {

    private Product product;
    private ProductNameValidationRule validationRule;

    @Before
    public void setUp() throws Exception {
        product = new Product();
        validationRule = new ProductNameValidationRule();
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateNameTooShort() {
        product.setName("a");
        validationRule.validate(product);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateNameTooLong() {
        product.setName("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        validationRule.validate(product);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateUniqueNames() {
        product.setName("name1");
        validationRule.validate(product);
        validationRule.validate(product);
    }

    @Test
    public void validate() {
        product.setName("name1");
        validationRule.validate(product);
    }



}