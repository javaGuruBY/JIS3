package org.example;

import org.example.bean.Stock;
import org.example.service.StockService;

public class App {
    public static void main(String[] args) {
       Stock mila = new Stock("Mila", 20);
       StockService stockService = new StockService();
       stockService.printInfo(mila);
       mila.setCurrentPrice(19);
       stockService.updatePrice(mila);
       stockService.printInfo(mila);
    }
}
