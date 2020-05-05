import bean.Product;
import service.ProductService;

public class ProductDemo {
    public static void main(String[] args) {
        Product CannabisInfusedCookie = new Product("cookie", 20, 15);
        Product CannabisInfusedBrownie = new Product("brownie", 25, 11);
        ProductService productService = new ProductService();

        productService.printInfo(CannabisInfusedCookie);
        productService.printInfo(CannabisInfusedBrownie);

        CannabisInfusedCookie.setDiscount(18);
        CannabisInfusedCookie.setPrice(22);
        CannabisInfusedBrownie.setDiscount(13);
        CannabisInfusedBrownie.setPrice(23);

        System.out.println("this week's products prices");

        productService.printInfo(CannabisInfusedCookie);
        productService.printInfo(CannabisInfusedBrownie);
    }
}
