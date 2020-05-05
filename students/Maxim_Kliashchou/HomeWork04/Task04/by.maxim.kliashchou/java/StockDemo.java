import bean.Stock;
import service.StockService;

public class StockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("Google", 15.5);
        StockService service = new StockService();

        service.printInformation(stock);
        service.updatePrice(stock, 20.5);
        service.updatePrice(stock, 5.5);
        service.printInformation(stock);


    }
}
