import java.util.Random;

public class RandomGeneratorDemo {

    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int rightLineOfNumbersRange = 11; // правая граница диапозона случайных чисел
        int a = randomGenerator.nextInt(rightLineOfNumbersRange);
        int b = randomGenerator.nextInt(rightLineOfNumbersRange);
        int c = randomGenerator.nextInt(rightLineOfNumbersRange);
        int sum = a + b + c;
        System.out.println("Sum of numbers " + sum);

    }
}
