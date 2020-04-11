package java.by.RandomGenerator;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args){
        Random randomGenerator = new Random();
                int number = 50;
                int oneNumber = randomGenerator.nextInt(number);
                int twoNumber = randomGenerator.nextInt(number);
                int threeNumber = randomGenerator.nextInt(number);

                System.out.println("First generated number =" + oneNumber );
                System.out.println("Second generated number =" + twoNumber);
                System.out.println("Third generation number =" + threeNumber);
                System.out.println("The amount =" +(oneNumber + twoNumber + threeNumber));

    }
}
