package by.mmkle.service;

import by.mmkle.bean.Product;
import by.mmkle.exceptions.NoSuchProductException;
import by.mmkle.repository.Shop;
import org.apache.commons.lang3.Range;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopService {
    public void add(Product product){
        Shop.stock.add(product);
    }

    public void remove(Product product){
        Shop.stock.remove(product);
    }

    public Product findByName(String name){
        for (Product product : Shop.stock){
            if (product.getName().equals(name)){
                return product;
            }
        }
        throw new NoSuchProductException();
    }

    public List<Product> productsInRange(BigDecimal minPriceRange, BigDecimal maxPriceRange){
        List<Product> products = new ArrayList<>();
        Range<BigDecimal> range = Range.between(minPriceRange, maxPriceRange);
        for (Product product : Shop.stock){
            if (range.contains(product.getPrice())){
                products.add(product);
            }
        }
        return products;
    }

}
