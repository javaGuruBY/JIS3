package by.jrr.checker.service;

public class DoWhileOddChecker {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 50);
    }
}
