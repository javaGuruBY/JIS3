package bean;

public class Stock {
    private int currentPrice;
    private int minPrice;
    private int maxPrice;
    private String companyName;

    public Stock(String companyName, int currentPrice) {
        this.currentPrice = currentPrice;
        this.companyName = companyName;
        this.minPrice = this.maxPrice = currentPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}