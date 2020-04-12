package bean;

public class Product {

    private String product = "Milk";
    private double regularPrice = 23.5;
    private double discount = 5.0;

    public Product(){
    }

    Product(String product){
        this.product = product;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setRegularPrice(double regularPrice){
        this.regularPrice = regularPrice;
    }

    public double getRegularPrice(){
        return regularPrice;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }

    public double getDiscount(){
        return discount;
    }

}

