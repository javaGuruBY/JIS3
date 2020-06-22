package com.javaguru.shoppinglist.service.validation;

import com.javaguru.shoppinglist.bean.Product;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ProductPriceValidationRuleTest {
    private Product product;
    private ProductPriceValidationRule validationRule;

    @Before
    public void setUp() throws Exception {
        product = new Product();
        validationRule = new ProductPriceValidationRule();
    }

    @Test(expected = IllegalArgumentException.class)
    public void validatePriceLessThanZero() {
        product.setPrice(new BigDecimal(-1));
        validationRule.validate(product);
    }

    @Test
    public void validate() {
        product.setPrice(new BigDecimal(100));
        validationRule.validate(product);
    }
}