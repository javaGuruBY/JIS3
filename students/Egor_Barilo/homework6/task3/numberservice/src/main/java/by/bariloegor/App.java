package by.bariloegor;

import by.bariloegor.service.NumberService;

public class App {
    public static void main(String[] args) {
        NumberService numberService = new NumberService();
        numberService.rangeSum(7, 3);
        numberService.rangeEvenCount(9, 2);
    }
}
