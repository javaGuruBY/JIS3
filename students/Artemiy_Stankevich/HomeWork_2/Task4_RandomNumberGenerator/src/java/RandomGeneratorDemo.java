import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGen = new Random();
        int num = 100;

        int firstNum = randomGen.nextInt(num);
        int secondNum = randomGen.nextInt(num);
        int thirdNum = randomGen.nextInt(num);

        System.out.println("Первое сгенерированное число = " + firstNum);
        System.out.println("Второе сгенерированное число = " + secondNum);
        System.out.println("Третье сгенерированное число = " + thirdNum);

        System.out.println("Sum = " + (firstNum + secondNum + thirdNum));
    }
}