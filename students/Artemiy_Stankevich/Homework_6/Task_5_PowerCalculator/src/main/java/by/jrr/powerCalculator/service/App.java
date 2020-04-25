package by.jrr.powerCalculator.service;

public class App {
    public static void main(String[] args) throws Exception {
        PowerCalculatorService powerCalculatorService = new PowerCalculatorService();
        System.out.println(powerCalculatorService.raisingToAGivenDegree(2, 4));
        System.out.println(powerCalculatorService.raisingToAGivenDegree(14, 2));
    }
}
