package by.jrr.shop;

import by.jrr.shop.bean.Product;
import by.jrr.shop.service.Shop;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

public class App {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger(App.class);
        Product product1 = new Product("Orange", 3.44);
        Product product2 = new Product("Chicken", 7.55);
        Product product3 = new Product("Potatoes", 4.01);
        Shop productShop = new Shop();
        productShop.addProduct(product1);
        productShop.addProduct(product2);
        productShop.addProduct(product3);
        logger.info(productShop.findProductByName("Orange"));
        productShop.deleteProduct(product1);
        logger.info(productShop.findAllProductsThatAreInTheDigitalRange(4.00, 8.00));


    }
}
