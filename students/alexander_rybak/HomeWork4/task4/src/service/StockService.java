package service;

import bean.Stock;

public class StockService {
    public void printInformation(Stock stock) {
        System.out.println("Company = \"" + stock.getCompanyName() + "\", Current Price = " + stock.getCurrentPrice()
                + ", Min Price = " + stock.getMinPrice() + ", Max Price = " + stock.getMinPrice());
    }
    public void updatePrice(Stock stock, int price) {
        if (price < stock.getMinPrice()) stock.setMinPrice(price);
        else if (price > stock.getMaxPrice()) stock.setMaxPrice(price);
        stock.setCurrentPrice(price);
    }
}