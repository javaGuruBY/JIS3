package by.jrr.bean;

public class PowerCalculator {
    public void powerCalculate(int a, int b) {
        if (a > 0 && b > 0 ) {
        for (int i = a; i <= b; i++) {
            System.out.printf("Значение " + i + " в квадрате равно %.0f \n", Math.pow(i, 2));
        }
        } else System.out.println("negative value");
    }
}

