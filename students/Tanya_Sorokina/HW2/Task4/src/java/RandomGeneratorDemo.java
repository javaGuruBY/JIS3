import java.util.Random;
public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int num = 100;

        int a = randomGenerator.nextInt(num);
        int b = randomGenerator.nextInt(num);
        int c = randomGenerator.nextInt(num);

        System.out.println("Первое сгенерированное число = " + a);
        System.out.println("Второе сгенерированное число = " + b);
        System.out.println("Третье сгенерированное число = " + c);

        System.out.println("Сумма = " + (a + b + c));
    }
}
