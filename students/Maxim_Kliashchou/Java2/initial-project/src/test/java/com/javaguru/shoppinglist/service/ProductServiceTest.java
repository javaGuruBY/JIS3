package com.javaguru.shoppinglist.service;

import com.javaguru.shoppinglist.bean.Category;
import com.javaguru.shoppinglist.bean.Product;
import com.javaguru.shoppinglist.repository.ProductRepository;
import com.javaguru.shoppinglist.service.validation.ProductValidationService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {
    @Mock
    private ProductRepository productRepository;

    @Mock
    private ProductValidationService validationService;

    @InjectMocks
    @Autowired
    private ProductService service;

    private Product product;


    @Before
    public void setUp() throws Exception {
        //service = new ProductService(productRepository, validationService);
        product = new Product("name", new BigDecimal(100), new BigDecimal(10), Category.SOME_CATEGORY, "description");
        product.setId(0L);
    }

    @Test
    public void createProduct() {
        Mockito.when(productRepository.insert(product)).thenReturn(product);
        Long expected = 0L;
        Long actual = service.createProduct(product);
        assertEquals("Shoud create product with id 0", expected, actual);
        Mockito.verify(productRepository).insert(product);
    }

    @Test
    public void findProductById() {
        Mockito.when(productRepository.findById(0L)).thenReturn(product);
        Product expected = product;
        Product actual = service.findProductById(0L);
        assertEquals("Shoud return product with id 0", expected, actual);
        Mockito.verify(productRepository).findById(0L);
    }
}