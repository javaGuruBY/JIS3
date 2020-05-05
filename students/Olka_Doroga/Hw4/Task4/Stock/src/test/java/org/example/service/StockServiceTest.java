package org.example.service;

import org.example.bean.Stock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockServiceTest {

    @Test
    void updatePriceMin() {
        int expected = 19;
        Stock mila = new Stock("Mila", 20);
        StockService stockService = new StockService();
        mila.setCurrentPrice(19);
        stockService.updatePrice(mila);
        assertEquals(expected, mila.getMinPrice(), "testMin");
    }

    @Test
    void updatePriceMax() {
        int expected = 21;
        Stock mila = new Stock("Mila", 20);
        StockService stockService = new StockService();
        mila.setCurrentPrice(21);
        stockService.updatePrice(mila);
        assertEquals(expected, mila.getMaxPrice(), "testMax");
    }

}