package by.jrr.checker.service;

public class WhileOddChecker {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 50) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
