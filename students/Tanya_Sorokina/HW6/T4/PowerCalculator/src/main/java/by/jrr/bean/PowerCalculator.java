package by.jrr.bean;

public class PowerCalculator {
    public int raiseToThePowerCalculator(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            if (a<=0 || b<=0){
                result = 0;
                System.out.println("You entered a negative value");
                break;
            }
            result = result * a;
        }
        return result;
    }
}
