package by.jrr;

import by.jrr.service.NumberService;

public class App {
    public static void main(String[] args) {
        NumberService numberService = new  NumberService ();
        System.out.println(numberService.rangeSum(2, 8));
        System.out.println(numberService.rangeEvenCount(2, 8));
    }
}
