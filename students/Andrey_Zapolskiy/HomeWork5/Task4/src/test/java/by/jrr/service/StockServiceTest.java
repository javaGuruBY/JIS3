package by.jrr.service;

import by.jrr.bean.Stock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockServiceTest {

    @Test
    void updatePrice() {

        Stock expectedResult = new Stock("google", 30, 10,50);

        Stock actualResult = new Stock("google", 30);
        StockService stockService = new StockService();
        actualResult.setCurrentPrice(10);
        stockService.updatePrice(actualResult);
        actualResult.setCurrentPrice(50);
        stockService.updatePrice(actualResult);
        actualResult.setCurrentPrice(30);
        stockService.updatePrice(actualResult);

        assertEquals(expectedResult, actualResult, "Google current price 50, minimal 10, maximum 50");


    }
}