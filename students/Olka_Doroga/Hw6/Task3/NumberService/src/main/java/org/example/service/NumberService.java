package org.example.service;

public class NumberService {
    public int rangeSum(int start, int finish) {
        int sum = 0;
        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                sum += i;
            }
        }
        if (start > finish) {
            for (int i = start; i >= finish; i--) {
                sum += i;
            }
        }
        return sum;
    }

    public int rangeEvenCount(int start, int finish) {
        int countEven = 0;
        if (start < finish) {
            for (int i = start; i <= finish; i++) {
                if (i % 2 == 0) {
                    countEven++;
                }
            }
        }
        if (start > finish) {
            for (int i = start; i >= finish; i--) {
                if (i % 2 == 0) {
                    countEven++;
                }
            }
        }
        return countEven;
    }
}

