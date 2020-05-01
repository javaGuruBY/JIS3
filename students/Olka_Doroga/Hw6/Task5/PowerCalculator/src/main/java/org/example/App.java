package org.example;

import org.example.bean.PowerCalculator;

public class App {
    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        System.out.println(powerCalculator.powerCalculator(3,2));
        System.out.println(powerCalculator.powerCalculator(-3,-2));
    }
}
