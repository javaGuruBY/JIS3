package by.bariloegor.service;

public class SignComparatorService {
    public String compare(int number){
        if(number > 0){
            return "Number is positive.";
        } else if(number<0){
            return "Number is negative.";
        } else return "Number is equal to zero.";
    }
}
