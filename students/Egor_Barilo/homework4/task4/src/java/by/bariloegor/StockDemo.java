package by.bariloegor;

import by.bariloegor.service.StockService;
import by.bariloegor.bean.Stock;
import by.bariloegor.test.StockTest;

public class StockDemo {
    public static void main(String[] args) {
        StockService stockService = new StockService();
        StockTest stockTest = new StockTest();
        stockTest.stockTest();

        Stock firstStock = new Stock("Malokosoft", 115.5);

        stockService.printInformation(firstStock);
        stockService.updatePrice(firstStock, 225.4);
        stockService.printInformation(firstStock);
        stockService.updatePrice(firstStock, 102.98);
        stockService.printInformation(firstStock);
    }
}
