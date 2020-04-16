package test;

import bean.Stock;
import service.StockService;

public class StockTestDrive {
    public static void main(String[] args) {
        StockTestDrive testRunner = new StockTestDrive();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
    }

    public void checkThatEqual(String testDescription, double expected, double actual) {
        if (expected == actual) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("expected \"" + expected + "\", but was \"" + actual + "\"");
        }
    }

    public void test1() {
        String testDescription = " the test should return maximum price";

        Stock stock = new Stock("volkswagen", 25);
        StockService stockService = new StockService();
        stockService.updateCurrentPrice(stock,35);

        double expected = 35;
        double actual = stock.getMaximumPrice();

        checkThatEqual(testDescription, expected, actual);
    }

    public void test2() {
        String testDescription = "test should return  minimum price";

        Stock stock = new Stock("volkswagen", 20);
        StockService stockService = new StockService();
        stockService.updateCurrentPrice(stock,5.9);

        double expected = 5.9;
        double actual = stock.getMinimumPrice();

        checkThatEqual(testDescription, expected, actual);
    }

    public void test3() {
        String testDescription = "test should return the current price";

        Stock stock = new Stock("volkswagen", 25);
        StockService stockService = new StockService();
        stockService.updateCurrentPrice(stock,20);

        double expected = 20;
        double actual = stock.getCurrentPrice();

        checkThatEqual(testDescription, expected, actual);
    }
}
