package service;

public class SignComparatorService {
    public String compare(int number) {
        if (number < 0) return "Number is negative";
        else if (number > 0) return "Number is positive";
        else return "Number is equal to zero";
    }
}