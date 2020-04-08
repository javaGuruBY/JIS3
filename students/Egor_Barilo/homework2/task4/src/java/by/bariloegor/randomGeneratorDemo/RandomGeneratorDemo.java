package by.bariloegor.randomGeneratorDemo;

import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args){
        Random randomGenerator = new Random();
        int rightLineOfNumbersRange = 101;
        int firstNumber = randomGenerator.nextInt(rightLineOfNumbersRange);
        int secondNumber = randomGenerator.nextInt(rightLineOfNumbersRange);
        int thirdNumber = randomGenerator.nextInt(rightLineOfNumbersRange);
        System.out.println("Resulting random numbers: " + firstNumber + ", " + secondNumber + ", " + thirdNumber + ".");
        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("The sum of the numbers is " + sum + ".");


    }
}
