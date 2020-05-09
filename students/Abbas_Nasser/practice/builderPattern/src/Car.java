public class Car implements Builder {

    private String brandName;
    private Product product;

    public Car(String brandName) {
        this.brandName = brandName;
        product = new Product();
    }
    public void startUpOperations() {
        product.add(String.format("Car model is :%s", this.brandName));
    }
    public void buildBody() {
        product.add("this is a body of a car");
    }
    public void insertWheels() {
        product.add("4 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("2 headlights are added");
    }

    @Override
    public void endOperations() {

    }

    public Product getVehicle() {
        return product;
    }

}
