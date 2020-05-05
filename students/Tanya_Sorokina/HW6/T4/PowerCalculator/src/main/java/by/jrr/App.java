package by.jrr;

import by.jrr.bean.PowerCalculator;


public class App {
    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        System.out.println("10 в 10-й степени = " + powerCalculator.raiseToThePowerCalculator(10, 10));
        System.out.println();
        System.out.println("10 в 0-й степени = " + powerCalculator.raiseToThePowerCalculator(10, 0));
        System.out.println();
        System.out.println("5 во 2-й степени = " + powerCalculator.raiseToThePowerCalculator(5,2));
        System.out.println();
        System.out.println("-5 во 2-й степени = " +powerCalculator.raiseToThePowerCalculator(-5, 2));
    }
}
