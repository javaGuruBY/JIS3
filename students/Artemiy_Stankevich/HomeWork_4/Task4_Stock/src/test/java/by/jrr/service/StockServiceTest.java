package by.jrr.service;

import by.jrr.bean.Stock;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockServiceTest {
    Stock stockTest;
    StockService stockServiceTest;
    double expected;
    double actual;

    @BeforeEach
    void init() {
        stockTest = new Stock("Google", 1500);
        stockServiceTest = new StockService();
    }


    @Test
    void updatePriceMinCost() throws Exception {
        stockServiceTest.updatePrice(stockTest, 100);
        expected = 100;
        actual = stockTest.getMinCost();
    }

    @Test
    void updatePriceMaxCost() throws Exception {
        stockServiceTest.updatePrice(stockTest, 2000.0);
        expected = 2000.0;
        actual = stockTest.getMaxCost();
    }
    @Test
    void updatePriceCurrentCost() throws Exception {
        stockServiceTest.updatePrice(stockTest, 1);
        expected = 1.0;
        actual = stockTest.getCurrentValue();
    }
    @AfterEach
    void assertEqualsInfo() {
        assertEquals(expected, actual, "[ERROR]");
    }
}