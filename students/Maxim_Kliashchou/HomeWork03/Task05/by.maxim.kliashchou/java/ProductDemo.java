import bean.Product;
import service.ProductService;

public class ProductDemo {
    public static void main(String[] args) {
        Product productOne = new Product("Beer", 2, 20);
        Product productTwo = new Product("Snacks", 1.5, 5);

        ProductService productService = new ProductService();

        productService.printInformation(productOne);
        productService.printInformation(productTwo);
    }
}