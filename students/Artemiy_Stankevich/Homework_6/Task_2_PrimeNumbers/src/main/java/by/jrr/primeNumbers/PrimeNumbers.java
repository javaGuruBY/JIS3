package by.jrr.primeNumbers;

import by.jrr.primeNumbers.service.IsPrimeService;

public class PrimeNumbers {
    public static void main(String[] args) {
        IsPrimeService isPrimeService = new IsPrimeService();
        int sumPrimeNumbers = 0;
        int count = 0;
        int countForNumCount = 0;
        for (int i = 2; i <= 500; i++) {
            if (isPrimeService.isPrime(i) || i == 2) {
                if (i == 17 || i == 71) {
                    continue;
                } else  sumPrimeNumbers+=i;
                        count++;
                if (count == 50) {
                    break;
                }
            }
        }
        System.out.println("Сумма простых чисел в диапазоне от 1 до 500 не включая 17 и 71 равно: " + sumPrimeNumbers);
        for (int i = 2; i <= 500; i++) {
            if (isPrimeService.isPrime(i) || i == 2) {
                if (i == 17 || i == 71) {} else countForNumCount++;
            }
        }
        System.out.println("Количество простых чиел от 1 до 500 включительно равно: " + countForNumCount);

    }
}
