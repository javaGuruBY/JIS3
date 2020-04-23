package by.jrr;

import by.jrr.bean.PowerCalculator;

public class App {


    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        powerCalculator.powerCalculate(1,10);
        powerCalculator.powerCalculate(-2,-4);


    }
}
