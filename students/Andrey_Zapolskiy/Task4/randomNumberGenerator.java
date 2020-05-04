import java.util.Random;
public class RandomDemo {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int unboundRandom = randomGenerator.nextInt();
        int unboundRandom1 = randomGenerator.nextInt();
        int boundRandom = randomGenerator.nextInt(15);
        int result = unboundRandom + unboundRandom1 + boundRandom;

        System.out.println("unboundRandom = " + unboundRandom);
        System.out.println("boundRandom = " + boundRandom);
        System.out.println("unboundRandom = " + unboundRandom1);
        System.out.println("sum of three random numbers = " + result);
    }
}
