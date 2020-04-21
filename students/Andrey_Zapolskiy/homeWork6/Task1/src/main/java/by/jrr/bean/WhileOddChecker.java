package by.jrr.bean;

public class WhileOddChecker {

    public static void main(String[] args) {

    int i = 0;
    while (i <= 50) {
        if(i%2 != 0) {
        System.out.print("\ni = " + i + "; ");
        }
        i++;
    }
    }
}
