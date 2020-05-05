package service;

import bean.Stock;

public class StockService {
    public void updatePrice(Stock stock, double price){
        stock.setPrice(price);
        stock.setMaximalPrice(Math.max(stock.getPrice(), stock.getMaximalPrice()));
        stock.setMinimalPrice(Math.min(stock.getPrice(), stock.getMinimalPrice()));
    }

    public void printInformation(Stock stock){
        System.out.println("Company = \"" + stock.getName() +
                            "\", Current Price = " + stock.getPrice() +
                            ", Min Price = " + stock.getMinimalPrice() +
                            ", Max Price = " + stock.getMaximalPrice()
        );
    }
}
