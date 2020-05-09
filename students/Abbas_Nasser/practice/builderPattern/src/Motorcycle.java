public class Motorcycle implements Builder {

    private String brandName;
    private Product product;

    public Motorcycle(String brandName) {
        this.brandName = brandName;
        product = new Product();
    }

    public void startUpOperations() {}

    public void buildBody() {
        product.add("this is a body of a motorcycle");
    }
    public void insertWheels() {
        product.add("2 wheels are added");
    }

    @Override
    public void addHeadlights() {
        product.add("1 headlight is added");
    }

    @Override
    public void endOperations() {
        product.add(String.format("motorcycle model is :%s", this.brandName));
    }

    public Product getVehicle() {
        return product;
    }
}
