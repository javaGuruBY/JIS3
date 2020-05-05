package by.rybak.service;

import by.rybak.bean.Number;

public class NumberService {

    public int rangeSum(Number number) {
        int sum = 0;
        if (number.getStart() > number.getEnd()) {
            for (int i = number.getStart(); i >= number.getEnd(); i--) {
                sum += i;
            }
        } else if (number.getStart() < number.getEnd()) {
            for (int i = number.getStart(); i <= number.getEnd(); i++) {
                sum += i;
            }
        } else {
            sum = number.getStart();
        }
        return sum;
    }

    public int rangeEvenCount(Number number) {
        int counter = 0;
        
        if (number.getStart() > number.getEnd()) {
            for (int i = number.getStart(); i >= number.getEnd(); i--) {
                if (isEven(i)) {
                    counter++;
                }
            }
        } else if (number.getStart() < number.getEnd()) {
            for (int i = number.getStart(); i <= number.getEnd(); i++) {
                if (isEven(i)) {
                    counter++;
                }
            }
        } else {
            if (isEven(number.getStart())) {
                counter++;
            }
        }
        return counter;
    }

    public boolean isEven(int number) {
        if (number == 0) return false;
        return (number % 2) == 0;
    }
}
