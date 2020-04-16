package by.jrr;

import by.jrr.bean.SingComparator;
import by.jrr.service.SingComparatorService;

public class App {
    public static void main(String[] args) {
        SingComparator singComparator = new SingComparator(10);
        SingComparatorService singComparatorService = new SingComparatorService();
        System.out.println(singComparatorService.compare(singComparator));
    }
}
