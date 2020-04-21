package by.jrr.bean;

public class DoWhileOddChecker {
    public static void main(String[] args) {
        int i = 0;
        do {
            if(i%2 != 0) {
            System.out.print("\ni = " + i + "; ");
            }
            i++;
        } while (i < 50);
    }
}
