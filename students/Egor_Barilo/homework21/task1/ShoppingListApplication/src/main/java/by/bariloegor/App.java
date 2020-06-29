package by.bariloegor;

import by.bariloegor.bean.Product;
import by.bariloegor.enums.Category;
import by.bariloegor.exception.IllegalProductValues;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Map<Long, Product> productRepository = new HashMap<>();
        Long productIdSequence = 0L;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("1. Create product");
                System.out.println("2. Find product by id");
                System.out.println("3. Exit");
                Integer userInput = Integer.valueOf(scanner.nextLine());
                switch (userInput) {
                    case 1:
                        System.out.println("Enter product name: ");
                        String name = scanner.nextLine();
                        if(name.length() < 3 || name.length() > 32){
                            throw new IllegalProductValues("Length of product name cant " +
                                    "be less than 3 and more than 32.");
                        }
                        System.out.println("Enter product price: ");
                        BigDecimal price = new BigDecimal(scanner.nextLine());
                        if(price.signum() < 0) {
                            throw new IllegalProductValues("Value of price cant be less than 0.");
                        }
                        System.out.println("Enter product category: ");
                        Category category = Category.valueOf(scanner.nextLine());
                        System.out.println("Enter product discount: ");
                        BigDecimal discount = new BigDecimal(scanner.nextLine());
                        if(discount.intValue() > 100){
                            throw new IllegalProductValues("Discount cant be more than 100%");
                        }
                        System.out.println("Enter product description: ");
                        String description = scanner.nextLine();
                        Product product = new Product();
                        product.setName(name);
                        product.setPrice(price);
                        product.setId(productIdSequence);
                        product.setCategory(category);
                        product.setDiscount(discount);
                        product.setDescription(description);
                        productRepository.put(productIdSequence, product);
                        productIdSequence++;
                        System.out.println("Result: " + product.getId());
                        break;
                    case 2:
                        System.out.println("Enter product id: ");
                        long id = scanner.nextLong();
                        Product findProductResult = productRepository.get(id);
                        System.out.println(findProductResult);
                        break;
                    case 3:
                        return;
                }
            } catch (Exception e) {
                System.out.println("Error! Please try again.");
            }
        }
    }
}
