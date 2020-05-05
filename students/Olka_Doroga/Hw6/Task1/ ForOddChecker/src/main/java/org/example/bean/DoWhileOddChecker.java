package org.example.bean;

public class DoWhileOddChecker {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.println("i = " + i + "; ");
            }
            i++;
        } while (i < 50);
    }
}