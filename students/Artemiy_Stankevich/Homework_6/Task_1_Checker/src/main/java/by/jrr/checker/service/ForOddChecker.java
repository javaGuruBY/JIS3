package by.jrr.checker.service;

public class ForOddChecker {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
