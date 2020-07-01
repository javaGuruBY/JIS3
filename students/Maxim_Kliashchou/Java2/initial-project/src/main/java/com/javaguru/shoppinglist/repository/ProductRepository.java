package com.javaguru.shoppinglist.repository;

import com.javaguru.shoppinglist.bean.Product;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ProductRepository {
    private Map<Long, Product> products = new HashMap<>();
    private Long productIdSequence = 0L;

    public Product insert(Product product){
        product.setId(productIdSequence);
        products.put(productIdSequence, product);
        productIdSequence++;
        return product;
    }

    public Product findById(Long id){
        return products.get(id);
    }
}
