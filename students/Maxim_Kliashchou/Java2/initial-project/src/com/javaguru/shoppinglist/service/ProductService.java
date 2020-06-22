package com.javaguru.shoppinglist.service;

import com.javaguru.shoppinglist.bean.Product;
import com.javaguru.shoppinglist.repository.ProductRepository;
import com.javaguru.shoppinglist.service.validation.ProductValidationService;

public class ProductService {
    private ProductRepository productRepository = new ProductRepository();
    private ProductValidationService validationService = new ProductValidationService();

    public Long createProduct(Product product){
        validationService.validate(product);
        Product createdProduct = productRepository.insert(product);
        return createdProduct.getId();
    }

    public Product findProductById(Long id){
        return productRepository.findById(id);
    }
}
