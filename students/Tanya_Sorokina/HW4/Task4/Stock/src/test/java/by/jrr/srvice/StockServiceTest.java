package by.jrr.srvice;
import by.jrr.bean.Stock;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

class StockServiceTest {
    Stock stock;
    StockService stockService;

    @BeforeEach
    public void init(){
        stock = new Stock();
        stockService = new StockService();
    }

    @Test
    public void updateMinPriceTest1() {
        stock.setCompanyName("FGR");
        stock.setCorrectPrice(105);
        stockService.updatePrice(stock, 104.23);
        double expected = 104.23;
        double actual = stock.getMinimumPrice();
        assertEquals(expected, actual);
        System.out.println("updateMinPriceTest1 has passed");
    }

    @Test
    public void updateMinPriceTest() {
        Stock stock = new Stock("FGR", 105.00);
        StockService stockService = new StockService();
        stockService.updatePrice(stock, 104.23);
        String expected = "Stock{companyName='FGR', price=104.23, minimalPrice=104.23, maximalPrice=105.00}";
        String actual = stock.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void updateMaxPriceTest() {
        Stock stock = new Stock("FGR", 105.00);
        StockService stockService = new StockService();
        stockService.updatePrice(stock, 105.55);
        String expected = "Stock{companyName='FGR', price=105.00, minimalPrice=105.00, maximalPrice=105.55}";
        String actual = stock.toString();
        assertEquals(expected, actual, "Error");

    }
}