package org.example.bean;

public class ForOddChecker {
    public static void main(String[] args) {
        int n = 50;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i = " + i + "; ");
        }
    }
}
