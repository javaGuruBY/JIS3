package by.jrr.service;
import by.jrr.bean.SingComparator;

public class SingComparatorService {
    String positive = "[INFO] Number is positive";
    String negative = "[INFO] number is negative";
    String zero = "[INFO] Number is equal to zero";

    public String compare(SingComparator singComparator) {
        if (singComparator.getNumber() > 0) return positive;
        else if (singComparator.getNumber() < 0) return negative;
        else return zero;
    }

}
