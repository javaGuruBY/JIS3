package by.jrr;

import by.jrr.service.LookupArrayService;

public class App {
    public static void main(String[] args) {
        LookupArrayService lookupArrayService = new LookupArrayService();
        int[] array1 = {1,2,3,4,5,6,7,8,9,999,100};
        System.out.println("indexOfMax = " + lookupArrayService.indexOfMax(array1));
        System.out.println("indexOfMin = " + lookupArrayService.indexOfMin(array1));
        System.out.println("findMax = " + lookupArrayService.findMax(array1));
        System.out.println("findMin = " + lookupArrayService.findMin(array1));
        System.out.println("indexOf 100 = " + lookupArrayService.indexOf(array1,100));

    }
}
