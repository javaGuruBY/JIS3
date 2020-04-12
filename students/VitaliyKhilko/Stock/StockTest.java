import bean.Stock;
import service.StockService;

public class StockTest {
    public static void main(String[] args) {
    StockTest test = new StockTest();
    test.number1();
    test.number2();
    test.number3();
    }


    public void number1(){
        String testDescription = "Should return update maxStock";
        Stock stock1 = new Stock("Qiwi",44,10,60);

        StockService stockService = new StockService();
        stockService.updatePrice(stock1,75);

        int expectedResult = 75;
        int actualResult = stock1.getMaxStock();
        checkThatEqual(expectedResult, actualResult, testDescription);
        System.out.println();
    }

    public void number2(){
        String testDescription = "Should return update minStock";
        Stock stock2 = new Stock("Webmoney",33,20,45);

        StockService stockService = new StockService();
        stockService.updatePrice(stock2,16);

        int expectedResult = 16;
        int actualResult = stock2.getMinStock();
        checkThatEqual(expectedResult, actualResult, testDescription);
        System.out.println();
    }

    public void number3(){
        String testDescription = "Should return update currentSharePrice";
        Stock stock3 = new Stock("Prior Bank",22,10,40);

        StockService stockService = new StockService();
        stockService.updatePrice(stock3,32);

        int expectedResult = 32;
        int actualResult = stock3.getCurrentSharePrice();
        checkThatEqual(expectedResult, actualResult, testDescription);
        System.out.println();
    }

    public void checkThatEqual(int expected, int actual, String testDescription) {
        if (expected == actual) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("expected \"" + expected + "\", but was \"" + actual + "\"");
        }
    }

}
