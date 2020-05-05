package by.jrr.service;

import by.jrr.bean.Stock;

public class StockService {

    public void updatePrice(Stock stock, double price) throws Exception {
        stock.setCurrentValue(price);
        if (price < stock.getMinCost()) {
            stock.setMinCost(price);
        }
        if (price > stock.getMaxCost()) {
            stock.setMaxCost(price);
        }
    }
    public void printInformation(Stock stock) {
        System.out.println("Company = " + stock.getNameCompany() + ", Current Price = " + stock.getCurrentValue()
                + ", Min price = " + stock.getMinCost() + ", Max price = " + stock.getMaxCost());
    }
}
