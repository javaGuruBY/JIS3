package org.example.servise;

import org.example.bean.SignComparator;

public class SignComparatorService {
    public String compare(SignComparator signComparator) {
        if (signComparator.getNumber() > 0) {
            return ("Number is positive");
        } else if (signComparator.getNumber() < 0) {
            return ("Number is negative");
        } else return "Number is equal to zero";
    }
}