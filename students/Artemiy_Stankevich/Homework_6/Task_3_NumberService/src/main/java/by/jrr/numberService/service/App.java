package by.jrr.numberService.service;

public class App {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        System.out.println("numberService.rangeSum(6,13) => " + numberService.rangeSum(6, 13));
        System.out.println("numberService.rangeEvenCount(20,1) => " + numberService.rangeEvenCount(20, 1));
    }
}
