package com.javaguru.shoppinglist.service.validation;

import com.javaguru.shoppinglist.bean.Product;

public class ProductNameValidationRule implements ProductValidationRule{
    @Override
    public void validate(Product product) {
        checkNotNull(product);
        if (product.getName().length() < 3 || product.getName().length() > 32){
            throw new IllegalArgumentException("Name length cant be less than 3 and more than 32");
        }
    }
}
