package service;

import bean.Product;

public class ProductService {

    double price(Product product) {
        return  product.getPrice() - (product.getPrice() / 100 * product.getDiscount());
    }

    public void printInfo(Product product) {
        System.out.println("Product : " + product.getName() + ", price is " +
                product.getPrice() + " $ , after discount : " + product.getDiscount() + "%, price is  " +
                new ProductService().price(product)+ " $");
}
}

