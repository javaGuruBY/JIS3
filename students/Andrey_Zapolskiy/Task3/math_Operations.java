public class MathOperationsDemo {
    public static void main(String[] args){
        MathOperation mathOperationDemo = new MathOperation();
        mathOperationDemo.differenceTwoNumbers(2,3);
        mathOperationDemo.divTwoNumbers(3,5);
        mathOperationDemo.multiplyTwoNumbers(4,5);
        mathOperationDemo.sumTwoNumbers(6,7);
    }
    public static class MathOperation {
        
        double result;

        public void sumTwoNumbers(int firstNumber, int secondNumber){
            result = firstNumber + secondNumber;
            System.out.println("sum of 2 integers = " + result);
        }

        public void differenceTwoNumbers(int firstNumber, int secondNumber){
            result = firstNumber - secondNumber;
            System.out.println("difference of 2 numbers = " + result);
        }

        public void divTwoNumbers(int firstNumber, double secondNumber){
            result = firstNumber / secondNumber;
            System.out.println("div of 2 numbers = " + result);
        }
        public void multiplyTwoNumbers(int firstNumber, int secondNumber) {
            result = firstNumber * secondNumber;
            System.out.println("Multiplication of 2 numbers = " + result);
        }

    }
}

