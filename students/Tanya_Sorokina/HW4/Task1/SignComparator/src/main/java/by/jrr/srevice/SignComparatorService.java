package by.jrr.srevice;

public class SignComparatorService {
    public static String compare(int number) {
        if (number > 0) {
            return "Number is positive";
        } else if (number < 0) {
            return "Number is negative";
        } else
            return "Number is equal to zero";
    }
}
