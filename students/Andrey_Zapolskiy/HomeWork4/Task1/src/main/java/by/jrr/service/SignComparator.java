package by.jrr.service;

import by.jrr.bean.Sign;

public class SignComparator {
    public String compare(Sign number) {
        if(number.getNumber()>0){
            return "Number is positive";
        } else if (number.getNumber()<0){
            return "Number is negative";
        } else {
            return "Number is equal to zero";
        }
    }
}
