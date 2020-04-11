public class MathOperationsDemo {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;

        MathOperationsDemo mathOperationsDemo = new MathOperationsDemo();
        mathOperationsDemo.sum(a, b);
        mathOperationsDemo.difference(a, b);
        mathOperationsDemo.multiply(a, b);
        mathOperationsDemo.division(a, b);
    }

    public void sum(int a, int b) {
        int sum = a + b;
        System.out.println("sum = " + sum);
    }

    public void difference(int a, int b) {
        int difference = a - b;
        System.out.println("diff = " + difference);
    }

    public void multiply(int a, int b) {
        int multiply = a * b;
        System.out.println("multiply = " + multiply);
    }

    public void division(double a, double b) {
        double division = a / b;
        System.out.println("division = " + division);
    }

}
