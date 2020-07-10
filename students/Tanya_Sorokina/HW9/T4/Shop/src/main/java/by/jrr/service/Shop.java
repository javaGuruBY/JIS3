package by.jrr.service;

import by.jrr.bean.Product;

import java.util.*;

public class Shop {

    private static final Set<Product> shop = new HashSet<>();

    public Shop(){
    }

    public Shop(Set<Product> shop) {
    }

    public Set<Product> getShop(){
        return shop;
    }

    public void addProduct(Product produkt){
        Shop.shop.add(produkt);
    }

    public void deleteProduct(Product produkt) {
        Shop.shop.remove(produkt);
    }

    public String findProductByName(String namesProduct){
        List<Product> productList = new ArrayList<>();
        for (Product product:shop) {
            if (product.getProductName().equals(namesProduct)){
                productList.add(product);
            }
        }
        return productList.toString();
    }

    public String findAllProductsInThePriceRange(double minCost, double maxCost){
        List<Product> rangeProductList = new LinkedList<>();
        for (Product product:shop) {
            if (product.getProductCost() >= minCost && product.getProductCost() <=maxCost){
                rangeProductList.add(product);
            }
        }
        return rangeProductList.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop1 = (Shop) o;
        return Objects.equals(shop, shop1.shop);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shop=" + shop +
                '}';
    }
}
