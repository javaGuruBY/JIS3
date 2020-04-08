package test;

import bean.Stock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.StockService;

public class StockServiceJUnitTest extends Assert {
    private StockService service = new StockService();
    private Stock stock = new Stock();

    @Before
    public void setUp(){
        service = new StockService();
        stock = new Stock("Google", 15.5);
    }

    @Test
    public void updateMinimalPriceTest(){
        double myPrice = 14.4;
        String testMessage = "Should be update minimal price";
        service.updatePrice(stock, myPrice);
        String expected = "Stock{name='Google', price=14.4, minimalPrice=14.4, maximalPrice=15.5}";
        String actual = stock.toString();
        assertEquals(testMessage, expected, actual);
    }

    @Test
    public void updateMaximalPriceTest(){
        double myPrice = 20.6;
        String testMessage = "Should be update maximal price";
        service.updatePrice(stock, myPrice);
        String expected = "Stock{name='Google', price=20.6, minimalPrice=15.5, maximalPrice=20.6}";
        String actual = stock.toString();
        assertEquals(testMessage, expected, actual);
    }
}
