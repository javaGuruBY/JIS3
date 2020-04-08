package by.rybak;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int firstRandomNumber = randomGenerator.nextInt(100);
        int secondRandomNumber = (int)(Math.random()*100);
        int thirdRandomNumber = randomGenerator.nextInt(100);
        int sum = firstRandomNumber + secondRandomNumber + thirdRandomNumber;

        System.out.println("the first random number is " + firstRandomNumber);
        System.out.println("the second random number is " + secondRandomNumber);
        System.out.println("the third random number is " + thirdRandomNumber);
        System.out.println("The sum of these numbers is " + sum);

    }
}