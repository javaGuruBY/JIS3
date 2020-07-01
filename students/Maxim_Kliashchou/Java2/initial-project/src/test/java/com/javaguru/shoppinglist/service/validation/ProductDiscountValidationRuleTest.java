package com.javaguru.shoppinglist.service.validation;

import com.javaguru.shoppinglist.bean.Product;
import com.javaguru.shoppinglist.service.validation.ProductDiscountValidationRule;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class ProductDiscountValidationRuleTest {
    private Product product;
    private ProductDiscountValidationRule validationRule;

    @Before
    public void setUp() throws Exception {
        product = new Product();
        product.setPrice(new BigDecimal(100));
        validationRule = new ProductDiscountValidationRule();
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateDiscountShouldBeLessThan100() {
        product.setDiscount(new BigDecimal(101));
        validationRule.validate(product);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateDiscountShouldBeMoreThan0() {
        product.setDiscount(new BigDecimal(-1));
        validationRule.validate(product);
    }

    @Test(expected = IllegalArgumentException.class)
    public void validateDiscountShouldBeZeroIfPriceLessThan20() {
        product.setPrice(new BigDecimal(10));
        product.setDiscount(new BigDecimal(10));
        validationRule.validate(product);
    }

    @Test
    public void validate() {
        product.setDiscount(new BigDecimal(10));
        validationRule.validate(product);
    }
}