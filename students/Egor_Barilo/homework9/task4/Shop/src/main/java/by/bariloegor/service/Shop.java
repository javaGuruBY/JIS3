package by.bariloegor.service;

import by.bariloegor.bean.Product;
import by.bariloegor.repository.Storage;
import org.apache.commons.lang3.Range;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    public void addProduct(Product product){
        Storage.shopStorage.add(product);
    }

    public void removeProduct(Product product){
        Storage.shopStorage.remove(product);
    }

    public Product findProduct(String productName){
        Product foundProduct = new Product(null, null);
        for(Product product : Storage.shopStorage){
            if(product.getName().equals(productName)){
                foundProduct = product;
            }
        }
        return foundProduct;
    }

    public List<Product> productInRange(BigDecimal minPrice, BigDecimal maxPrice){
        List<Product> products = new ArrayList<>();
        Range<BigDecimal> range = Range.between(minPrice, maxPrice);
        for (Product product : Storage.shopStorage){
            if (range.contains(product.getPrice())){
                products.add(product);
            }
        }
        return products;
    }
}
