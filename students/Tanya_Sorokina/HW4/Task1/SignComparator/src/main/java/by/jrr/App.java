package by.jrr;
import by.jrr.srevice.SignComparatorService;

public class App {
    public static void main(String[] args) {
        SignComparatorService signComparatorService = new SignComparatorService();
        System.out.println("number -5 -- " + SignComparatorService.compare(-5));
        System.out.println("number 5 -- " + SignComparatorService.compare(5));
        System.out.println("number 0 -- " + SignComparatorService.compare(0));
        System.out.println("number 10 -- " + SignComparatorService.compare(10));
        System.out.println("number -20 -- " + SignComparatorService.compare(-20));
    }
}
