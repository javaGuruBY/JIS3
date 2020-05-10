package by.bariloegor.service;

import by.bariloegor.bean.Stock;

public class StockService {

    public void updatePrice(Stock stock, double newPrice){
        stock.setActualPrice(newPrice);
        stock.setMaxPrice(Math.max(newPrice, stock.getMaxPrice()));
        stock.setMinPrice(Math.min(newPrice,stock.getMinPrice()));
    }

    public void printInformation(Stock stock){
        System.out.println("\nStock name: " + stock.getName() + "\nStock actual price: " + stock.getActualPrice() +
                "\nStock max price: " + stock.getMaxPrice() + "\nStock min price: " + stock.getMinPrice());
    }
}
