import java.util.LinkedList;

public class Product {

    private LinkedList<String> parts = new LinkedList<>();



    public Product() {

    }

    public void add(String part) {
        parts.addLast(part);
    }
    public void showProduct() {
        System.out.println("\n product completed as below :");
        for (String part: parts)
            System.out.println(part);
        }
    }

