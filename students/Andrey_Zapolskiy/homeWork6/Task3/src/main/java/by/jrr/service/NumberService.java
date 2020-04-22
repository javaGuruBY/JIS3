package by.jrr.service;

public class NumberService {
    public int rangeSum(int start, int finish) {

        int sum = 0;
        if(finish < start) {
            for(int i = start; i >= finish; i--) {
                sum += i;
            }
        } else if(finish > start){
            for(int i = start; i <= finish; i++) {
                sum+= i;
            }
        }
        return sum;
    }

    public int rangeEvenCount(int start, int finish) {
        int count = 0;
        if(finish < start) {
            for(int i = start; i >= finish; i--) {
                if(i%2 == 0) {
                    count++;
                }
            }
        } else if(finish > start){
            for(int i = start; i <= finish; i++) {
                if(i%2 == 0){
                    count++;
                }

            }
        }
        return count;
//        Подсчет количества четных чисел в заданном интервале включительно. Если начала интервала превышает конец,
//                то необходимо выполнить расчет в обратном порядке. Например,
//                количество четных чисел в диапазоне от 2 до 9 равно 2, 4, 6, 8 => 4 и наоборот: 8, 6, 4, 2 => 4.
    }

}