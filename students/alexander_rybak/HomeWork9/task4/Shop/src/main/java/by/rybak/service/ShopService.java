package by.rybak.service;

import by.rybak.bean.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShopService {
    private Map<String, BigDecimal> map = new HashMap<>();

    public void addProduct(Product product){
        map.put(product.getName(), product.getPrice());
    }

    public void deleteProduct(Product product){
        map.remove(product.getName());
    }

    public Product findByName(String nameOfProduct){
        for(Map.Entry<String, BigDecimal> el: map.entrySet()) {
            if(el.getKey().equals(nameOfProduct)){
                Product product = new Product(el.getKey(),el.getValue());
                return product;
            }
        }
        return null;
    }

    public ArrayList<Product> findProduct(BigDecimal minPriceRange, BigDecimal maxPriceRange) {
        ArrayList<Product> products = new ArrayList<>();
        for(Map.Entry<String, BigDecimal> el: map.entrySet()) {
            if(el.getValue().compareTo(minPriceRange) == 1 && el.getValue().compareTo(maxPriceRange) == -1){
                Product product = new Product(el.getKey(),el.getValue());
                products.add(product);
            }
        }
        return products;
    }
}
