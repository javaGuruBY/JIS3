package com.javaguru.shoppinglist.service;

import com.javaguru.shoppinglist.bean.Product;
import com.javaguru.shoppinglist.repository.ProductRepository;
import com.javaguru.shoppinglist.service.validation.ProductValidationService;

public class ProductService {
    private ProductRepository productRepository;
    private ProductValidationService validationService;

    public ProductService(ProductRepository productRepository, ProductValidationService validationService) {
        this.productRepository = productRepository;
        this.validationService = validationService;
    }

    public Long createProduct(Product product){
        validationService.validate(product);
        Product createdProduct = productRepository.insert(product);
        return createdProduct.getId();
    }

    public Product findProductById(Long id){
        return productRepository.findById(id);
    }
}
