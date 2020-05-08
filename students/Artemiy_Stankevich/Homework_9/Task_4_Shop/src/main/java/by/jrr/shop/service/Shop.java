package by.jrr.shop.service;

import by.jrr.shop.bean.Product;
import java.util.*;

public class Shop {
    private static final Set<Product> shop = new HashSet<>();

    public Shop() {
    }
    public Shop(Set<Product> shop) {
    }

    public Set<Product> getShop() {
        return shop;
    }

    public void addProduct(Product product){
        Shop.shop.add(product);
    }

    public void deleteProduct(Product product) {
        Shop.shop.remove(product);
    }

    public String findProductByName(String name) {
        List<Product> listProducts = new ArrayList<>();
        for (Product p:shop
             ) {
            if(p.getNameProduct().equals(name)) {
                listProducts.add(p);
            }
        }return listProducts.toString();
    }
    public String findAllProductsThatAreInTheDigitalRange(double minCost, double maxCost) {
        List<Product> rangeProducts = new LinkedList<>();
        for (Product p:shop
             ) {
            if(p.getCost() >= minCost && p.getCost() <= maxCost) {
                rangeProducts.add(p);
            }
        }return rangeProducts.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop1 = (Shop) o;
        return Objects.equals(shop, shop1.shop);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shop);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shop=" + shop +
                '}';
    }
}
