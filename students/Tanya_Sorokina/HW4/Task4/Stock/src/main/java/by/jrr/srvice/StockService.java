package by.jrr.srvice;
import by.jrr.bean.Stock;

public class StockService {

    public void updatePrice(Stock stock, double correctPrice) {
        if (correctPrice < stock.getCurrentValue()) {
            stock.setMinimumPrice(correctPrice);
        } else if (correctPrice > stock.getCurrentValue()) {
            stock.setMaximumPrice(correctPrice);
        }
    }

    public void printInformation(Stock stock){
            System.out.println("Company = " + stock.getCompanyName() + ", Current Price = " + stock.getCurrentValue()
                    + ", Min price = " + stock.getMinimumPrice() + ", Max price = " + stock.getMaximumPrice());
        }
}
