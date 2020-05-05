package service;

import bean.Stock;

public class StockService {

    public void printInformation(Stock stock){
        System.out.println("Company = \"" + stock.getCompanyName() +
                "\", Current Price = " + stock.getCurrentPrice() +
                ", Minimum Price = " + stock.getMinimumPrice() +
                ", Maximum Price = " + stock.getMaximumPrice());
    }
    public void updateCurrentPrice(Stock stock, double price) {
        if (price < stock.getMinimumPrice()) stock.setMinimumPrice(price);
        else if (price > stock.getMaximumPrice()) stock.setMaximumPrice(price);
        stock.setCurrentPrice(price);
    }

}
