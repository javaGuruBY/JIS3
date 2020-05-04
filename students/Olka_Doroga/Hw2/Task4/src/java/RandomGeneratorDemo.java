import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {
        Random randomGeneratorDemo = new Random();
        int random1 = randomGeneratorDemo.nextInt(100);
        int random2 = randomGeneratorDemo.nextInt(100);
        int random3 = randomGeneratorDemo.nextInt(100);
        System.out.println("random1 = " + random1 + ", random 2 = "
                + random2 + ", random 3 = " + random3);

        int sumRandoms = random1 + random2 + random3;
        System.out.println("sumRandoms = " + sumRandoms);

    }
}
