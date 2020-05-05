package by.abs.bean;


import org.apache.commons.lang3.Range;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopService {
    public void add(Products product){
        Shop.stock.add(product);
    }

    public void remove(Products product){
        Shop.stock.remove(product);
    }

    public Products findByName(String name) {
        for (Products product : Shop.stock) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
return null;
    }
    public List<Products> productsInRange(BigDecimal minPriceRange, BigDecimal maxPriceRange){
        List<Products> products = new ArrayList<>();
        Range<BigDecimal> range = Range.between(minPriceRange, maxPriceRange);
        for (Products product : Shop.stock){
            if (range.contains(product.getPrice())){
                products.add(product);
            }
        }
        return products;
}
}