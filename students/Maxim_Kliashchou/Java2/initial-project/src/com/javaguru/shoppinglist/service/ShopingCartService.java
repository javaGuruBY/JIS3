package com.javaguru.shoppinglist.service;

import com.javaguru.shoppinglist.bean.Product;
import com.javaguru.shoppinglist.bean.ShopingCart;

import java.math.BigDecimal;
import java.util.List;

public class ShopingCartService {

    public void addProductToCart(ShopingCart shopingCart, Product product){
        shopingCart.productList.add(product);
    }

    public List<Product> getProductList(ShopingCart shopingCart){
        return shopingCart.productList;
    }

    public BigDecimal getPriceOfAllProducts(ShopingCart shopingCart){
        BigDecimal sum = new BigDecimal(0);
        for (Product product : shopingCart.productList){
            sum.add(productPriceWithDiscount(product));
        }
        return sum;
    }

    private BigDecimal productPriceWithDiscount(Product product) {
        return product.getPrice().multiply(product.getDiscount().divide(new BigDecimal(100)));
    }
}
