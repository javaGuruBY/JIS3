import bean.Product;
import service.ServiceProduct;

public class ProductDemo {
    public static void main(String[] args) {
        Product name = new Product();
        ServiceProduct service = new ServiceProduct();
        service.printInformation(name);
    }
}
