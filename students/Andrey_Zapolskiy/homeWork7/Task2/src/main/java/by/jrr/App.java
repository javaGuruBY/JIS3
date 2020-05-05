package by.jrr;

import by.jrr.service.ArrayService;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int [] array = arrayService.create(4);
        arrayService.fillRandomly(array);
        arrayService.printArray(array);
        System.out.println("arrayService.sum(array) = " + arrayService.sum(array));
        System.out.println("arrayService.avg(array) = " + arrayService.avg(array));
    }

}
