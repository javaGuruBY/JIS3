package com.javaguru.shoppinglist.service;

import com.javaguru.shoppinglist.bean.Product;
import com.javaguru.shoppinglist.bean.ShopingCart;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class ShopingCartService {

    public void addProductToCart(ShopingCart shopingCart, Product product){
        List<Product> list = shopingCart.getProductList();
        list.add(product);
        shopingCart.setProductList(list);
    }

    public List<Product> getProductList(ShopingCart shopingCart){
        return shopingCart.getProductList();
    }

    public BigDecimal getPriceOfAllProducts(ShopingCart shopingCart){
        BigDecimal sum = new BigDecimal(0);
        List<Product> productList = shopingCart.getProductList();
        for (Product product : productList){
            sum = sum.add(productPriceWithDiscount(product));
        }
        return sum;
    }

    private BigDecimal productPriceWithDiscount(Product product) {
        BigDecimal result = product.getPrice().subtract(
                product.getPrice().multiply(product.getDiscount().divide(new BigDecimal(100)))
        );
        return result;
    }
}
