package by.jrr;

import by.jrr.bean.Stock;
import by.jrr.srvice.StockService;

public class App {
    public static void main(String[] args) {
        Stock stock = new Stock("GTS", 599.56);
        StockService stockService = new StockService();
        stockService.updatePrice(stock, 690.88);
        stockService.printInformation(stock);
    }
}
