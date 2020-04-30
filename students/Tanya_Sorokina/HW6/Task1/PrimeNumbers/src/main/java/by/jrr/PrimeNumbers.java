package by.jrr;

//Функциональные требования:
//
//        Разработать класс PrimeNumbers, который считает сумму простых чисел в диапазоне от 1 до 500 включительно.
//        Дополнительно посчитайте количество простых чисел, которые входят в этот диапазон.
//
//        Ограничения:
//
//        Числа 17 и 71 не должны учитываться при подсчете суммы и количества простых чисел.
//        В случае, если количество простых чисел равно 50, подсчет необходимо завершить досрочно.
//        Для решения задачи используйте цикл for и операторы continue, break.
//
//        Необходимо вывести на экран количество простых чисел и их сумму.
//
//        Решение можно реализовать в методе main() соответствующего класса.
//
//        Простое число n является простым, если оно больше 1 и при этом делится без остатка только на 1 и на n.
//        Последовательность простых чисел начинается так: 2, 3, 5, 7, 11, 13, 17, 19, 23...
//
//        Нефункциональные требования:
//
//        Продемонстрировать работу класса.
//
//        Ожидаемый результат в консоли:
//
//        sum = 5501 count = 50

import by.jrr.service.PrimeNumbersService;

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbersService primeNumbersService = new PrimeNumbersService();
        int sumPrimeNumbers = 0;
        int count = 0;
        int countPrimeNumbers = 0;
        int n = 500;
        int i;
        for ( i = 2; i <= n; i++) {
            if (primeNumbersService.thisPrimeNumbers(i) || i == 2){
                if (i == 17 || i == 71) {
                    continue;
                } else sumPrimeNumbers += i;
                count++;
                if (count == 50) {
                    break;
                }
            }
        }
        System.out.println("sum: " + sumPrimeNumbers);

        for ( i = 2; i <= n; i++) {
            if (primeNumbersService.thisPrimeNumbers(i) || i == 2) {
                if (i == 17 || i == 71) {
                } else countPrimeNumbers++;
                    if(countPrimeNumbers == 50) {
                        break;
                    }
            }
        }
        System.out.println("count: " + countPrimeNumbers);
    }
}


