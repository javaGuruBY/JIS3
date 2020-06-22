package com.javaguru.shoppinglist.service.validation;

import com.javaguru.shoppinglist.bean.Product;

import java.math.BigDecimal;

public class ProductDiscountValidationRule implements ProductValidationRule{
    @Override
    public void validate(Product product) {
        checkNotNull(product);
        if (product.getDiscount().compareTo(new BigDecimal(100)) > 0){
            throw new IllegalArgumentException("Discount can't be more than 100");
        }
    }
}
