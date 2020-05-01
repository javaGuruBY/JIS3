package org.example.bean;

public class PowerCalculator {
    public int powerCalculator(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++ ) {
            if (a > 0 & b > 0) {
                result = result * a;
            }
        }
        return result;
    }
}
