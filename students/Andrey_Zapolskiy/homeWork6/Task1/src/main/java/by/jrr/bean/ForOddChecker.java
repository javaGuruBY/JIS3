package by.jrr.bean;

public class ForOddChecker {
    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            if(i%2 != 0) {
                System.out.print("\ni = " + i + "; ");
            }
        }
    }
}