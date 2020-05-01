package by.bariloegor;

import by.bariloegor.bean.Product;
import by.bariloegor.repository.Storage;
import by.bariloegor.service.Shop;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);
        Shop shop = new Shop();
        Product[] products = {new Product("Milk", BigDecimal.valueOf(2.5)),
                new Product("Bread", BigDecimal.valueOf(3.0)),
                new Product("Salt", BigDecimal.valueOf(0.5)),
                new Product("Choco", BigDecimal.valueOf(4.0))};
        Storage.shopStorage.addAll(Arrays.asList(products));

        shop.removeProduct(products[2]);
        String result = Storage.shopStorage.toString();
        log.info(result);
        result = shop.productInRange(BigDecimal.valueOf(2.0), BigDecimal.valueOf(5.0)).toString();
        log.info(result);
    }
}
