package by.jrr.srvice;
import by.jrr.bean.Stock;

public class StockService {

    public void updatePrice(Stock stock, double correctPrice) {
//        Stock stock = new Stock();
//        stock.setCurrentValue(correctPrice);
        if (correctPrice < stock.getCurrentValue()) {
            stock.setMinimumPrice(correctPrice);
        } else if (correctPrice > stock.getCurrentValue()) {
            stock.setMaximumPrice(correctPrice);
        }

//        stock.setMinimumPrice(Math.min(stock.getCurrentValue(), stock.getMinimumPrice()));
//        stock.setMaximumPrice(Math.max(stock.getCurrentValue(), stock.getMaximumPrice()));
    }

    public void printInformation(Stock stock){
            System.out.println("Company = " + stock.getCompanyName() + ", Current Price = " + stock.getCurrentValue()
                    + ", Min price = " + stock.getMinimumPrice() + ", Max price = " + stock.getMaximumPrice());
        }


}
