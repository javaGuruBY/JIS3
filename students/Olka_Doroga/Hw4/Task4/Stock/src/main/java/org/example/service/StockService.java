package org.example.service;

import org.example.bean.Stock;

public class StockService {
    public void updatePrice(Stock stock) {
        if (stock.getMaxPrice() < stock.getCurrentPrice()) {
            stock.setMaxPrice(stock.getCurrentPrice());
        } else if (stock.getMinPrice() > stock.getCurrentPrice()) {
            stock.setMinPrice(stock.getCurrentPrice());
        }
    }

    public void printInfo(Stock stock) {
        System.out.println("Company = " + stock.getNameCompany()
                + ", Current Price = " + stock.getCurrentPrice()
                + ", Min Price = " + stock.getMinPrice()
                + ", Max Price = " + stock.getMaxPrice());
    }
}