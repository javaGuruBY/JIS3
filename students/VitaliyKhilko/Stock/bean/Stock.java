package bean;

public class Stock {
    private String nameCompany = "Sberbank";
    private int currentSharePrice;
    public int maxStock;
    public int minStock;

    public Stock(){
    }

    public Stock(String nameCompany){
        this.nameCompany = nameCompany;
    }

    public Stock(String nameCompany, int currentSharePrice, int minStock, int maxStock){
        this.nameCompany = nameCompany;
        this.currentSharePrice = currentSharePrice;
        this.minStock = minStock;
        this.maxStock = maxStock;

    }


    public void setMaxStock(int maxSt){
        this.maxStock = maxSt;
    }

    public int getMaxStock(){
        return this.maxStock;
    }

    public void setMinStock(int minSt){
        this.minStock = minSt;
    }

    public int getMinStock(){
        return this.minStock;
    }

    public void setNameCompany(String name){
        this.nameCompany = name;
    }

    public String getNameCompany(){
        return nameCompany;
    }

    public void setCurrentSharePrice(int currentPrice){
        this.currentSharePrice = currentPrice;
    }

    public int getCurrentSharePrice(){
        return currentSharePrice;
    }

}
