import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int maxN = 100000;

        int number1 = randomGenerator.nextInt(maxN);
        int number2 = randomGenerator.nextInt(maxN);
        int number3 = (int)(Math.random() * maxN);

        System.out.println("First number = " + number1);
        System.out.println("Second number = " + number2);
        System.out.println("Third number = " + number3);

        System.out.println("Sum = " + (number1 + number2 + number3));
    }
}