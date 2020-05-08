package by.jrr;

import by.jrr.service.ArrayService;

public class App {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] array2=arrayService.create(5);
        arrayService.printArray(array2);
        System.out.println();
        arrayService.fillRandomly(array2);
        arrayService.printArray(array2);
        System.out.println("среднее арифметическое всех элементов массива array = " + arrayService.avg(array));
        System.out.println("сумму всех элементов массива array = " + arrayService.sum(array));
        int[] array3 = {1,3,5,7};
        arrayService.swap(array3);
        arrayService.printArray(array3);
        arrayService.sort(array3);
        System.out.println();
        arrayService.printArray(array3);
    }
}
