public class MathOperationsDemo {
    public static void main(String[] args) {
        int firstNum = 10;
        int secondNum = 25;

        int add = firstNum + secondNum;
        int sub = firstNum - secondNum;
        int mult = firstNum * secondNum;
        double div = (double)firstNum / secondNum;

        System.out.println("First operation 'addition' firstNum + secondNum = " + add);
        System.out.println("Second operation 'subtraction' firstNum - secondNum = " + sub);
        System.out.println("Third operation 'multiplication' firstNum * secondNum = " + mult);
        System.out.println("Fourth operation 'division' firstNum / secondNum = " + div);

    }
}