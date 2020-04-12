package service;
import bean.Stock;

public class StockService {

    public void updatePrice(Stock stock,int price){
        if(price < stock.getMinStock()){
            stock.setMinStock(price);
        }else if(price > stock.getMaxStock()){
            stock.setMaxStock(price);
        } else{
            stock.setCurrentSharePrice(price);
        }
    }

    public void printInformation(Stock stock){
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("  Company = " + stock.getNameCompany() + " , " +
                "Current Price = " + stock.getCurrentSharePrice() + " , " +
                "Min Price = " + stock.getMinStock() + " , " + "Max Price = " + stock.getMaxStock());
        System.out.println("-----------------------------------------------------------------------------");
    }
}
