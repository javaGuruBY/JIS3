import bean.Product;
import service.ProductService;

public class ProductDemo {
    public static void main(String[] args) {
        Product milk = new Product("Milk", 2, 20);
        Product cheese = new Product("Cheese", 10, 17);

        ProductService productService = new ProductService();

        productService.printInformation(milk);
        productService.printInformation(cheese);

        milk.setDiscount(50);
        milk.setRegularPrice(4);
        cheese.setRegularPrice(18);
        cheese.setDiscount(14)
        ;
        System.out.println("Information about milk after changes:");

        productService.printInformation(milk);
        productService.printInformation(cheese);
    }
}