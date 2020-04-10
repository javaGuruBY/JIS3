package by.bariloegor.test;

import by.bariloegor.bean.Stock;
import by.bariloegor.service.StockService;

public class StockTest {
    private Stock stock = new Stock("TestCorp", 100.0);
    private StockService stockService = new StockService();

    private void assertEquals(String testName, double expected, double actual){
        boolean result = expected == actual;
        if(result){
            System.out.println("[INFO] " + testName + " test passed successfully.");
        } else {
            System.out.println("[ERROR] " + testName + " test failed. Expected '" + expected +
                    "' but was '" + actual + "'.");
        }
    }

    private void setDefaultValue(Stock stock){
        stock.setActualPrice(100);
        stock.setMaxPrice(100);
        stock.setMinPrice(100);
    }

    private void actualPriceUpdateTest(){
        stockService.updatePrice(stock, 110.0);
        double expected = 110.0;
        double actual = stock.getActualPrice();
        assertEquals("Update actual price", expected, actual);
        setDefaultValue(stock);
    }

    private void maxPriceUpdateTest(){
        stockService.updatePrice(stock, 200.0);
        double expected = 200.0;
        double actual = stock.getMaxPrice();
        assertEquals("Update max price", expected, actual);
        setDefaultValue(stock);
    }

    private void minPriceUpdateTest(){
        stockService.updatePrice(stock, 50.0);
        double expected = 50.0;
        double actual = stock.getMinPrice();
        assertEquals("Update min price", expected, actual);
        setDefaultValue(stock);
    }

    public void stockTest(){
        actualPriceUpdateTest();
        maxPriceUpdateTest();
        minPriceUpdateTest();
    }
}
