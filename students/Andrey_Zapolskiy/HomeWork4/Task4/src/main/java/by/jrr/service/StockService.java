package by.jrr.service;

import by.jrr.bean.Stock;

public class StockService {

    public void updatePrice(Stock stock) {

        if (stock.getMaximumPrice() < stock.getCurrentPrice()){
            stock.setMaximumPrice(stock.getCurrentPrice());
        } else if (stock.getMinimalPrice() > stock.getCurrentPrice()) {
            stock.setMinimalPrice(stock.getCurrentPrice());
        } else if (stock.getMaximumPrice() == stock.getCurrentPrice()) {
            stock.setMaximumPrice(stock.getCurrentPrice());
        }
    }
    public void printInfo(Stock stock){
        System.out.println("companyName:" +" "+  stock.getCompanyName()
                + "\n" + "currentStockPrice :" +" "+ stock.getCurrentPrice()
                + "\n" + "minStockPrice:" +" "+ stock.getMinimalPrice()
                +"\n" + "maxStockPrice:" +" "+ stock.getMaximumPrice());

    }
}
