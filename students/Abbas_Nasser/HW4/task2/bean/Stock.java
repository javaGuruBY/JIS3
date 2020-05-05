package bean;

public class Stock {
    private double minimumPrice;
    private double maximumPrice;
    private double currentPrice;
    private String companyName;

    public Stock(String companyName, double currentPrice){
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minimumPrice = currentPrice;
        this.maximumPrice = maximumPrice;


    }

    public void setMinimumPrice(double minimumPrice) {
        this.minimumPrice = minimumPrice;
    }

    public double getMaximumPrice() {
        return maximumPrice;
    }

    public void setMaximumPrice(double maximumPrice) {
        this.maximumPrice = maximumPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getMinimumPrice() {
        return minimumPrice;
    }
}


