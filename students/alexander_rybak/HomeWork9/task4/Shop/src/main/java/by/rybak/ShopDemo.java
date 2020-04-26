package by.rybak;

import by.rybak.bean.Product;
import by.rybak.service.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class ShopDemo {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(ShopDemo.class);
        Product[] products = new Product[3];
        ShopService service = new ShopService();

        products[0] = new Product("Apple", new BigDecimal(4));
        products[1] = new Product("Potato", new BigDecimal(1));
        products[2] = new Product("Oranges", new BigDecimal(3));

        service.addProduct(products[0]);
        service.addProduct(products[1]);
        service.addProduct(products[2]);

        log.info(String.valueOf(service.findByName("Potato")));
        log.info(String.valueOf(service.findProduct(new BigDecimal(2), new BigDecimal(5))));

        service.deleteProduct(products[2]);
        log.info(String.valueOf(service.findProduct(new BigDecimal(2), new BigDecimal(5))));

    }
}
