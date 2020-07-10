package by.jrr;

import by.jrr.bean.Product;
import by.jrr.service.Shop;

public class App {
    public static void main(String[] args) {
        Shop shop1 = new Shop();
        Product product1 = new Product("apple", 2.62);
        Product product2 = new Product("map", 30.10);
        Product product3 = new Product("cup", 4.33);
        Product product4 = new Product("coffee", 15.85);
        Product product5 = new Product("tee", 5.55);
        shop1.addProduct(product1);
        shop1.addProduct(product2);
        shop1.addProduct(product3);
        shop1.addProduct(product4);
        shop1.addProduct(product5);
        System.out.println("Find product tee - " + shop1.findProductByName("tee"));
        System.out.println("Find product cup - " + shop1.findProductByName("cup"));
        shop1.deleteProduct(product3);
        System.out.println("cup was delete");
        System.out.println("Find product cup - " + shop1.findProductByName("cup"));
        System.out.println("Find product cost 3-10 - " + shop1.findAllProductsInThePriceRange(3, 10));
    }
}
