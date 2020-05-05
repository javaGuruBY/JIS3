package test;

import bean.Stock;
import service.StockService;

public class StockTest {
    public static void main(String[] args) {
        StockTest testRunner = new StockTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
    }

    public void checkThatEqual(int expected, int actual, String testDescription) {
        if (expected == actual) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("expected \"" + expected + "\", but was \"" + actual + "\"");
        }
    }

    public void test1() {
        String testDescription = "Should return true max price";

        Stock stock = new Stock("Apple", 15);
        StockService stockService = new StockService();
        stockService.updatePrice(stock,20);

        int expected = 20;
        int actual = stock.getMaxPrice();

        checkThatEqual(expected, actual, testDescription);
    }

    public void test2() {
        String testDescription = "Should return true min price";

        Stock stock = new Stock("Apple", 15);
        StockService stockService = new StockService();
        stockService.updatePrice(stock,5);

        int expected = 5;
        int actual = stock.getMinPrice();

        checkThatEqual(expected, actual, testDescription);
    }

    public void test3() {
        String testDescription = "Should return true current price";

        Stock stock = new Stock("Apple", 15);
        StockService stockService = new StockService();
        stockService.updatePrice(stock,5);

        int expected = 5;
        int actual = stock.getCurrentPrice();

        checkThatEqual(expected, actual, testDescription);
    }
}