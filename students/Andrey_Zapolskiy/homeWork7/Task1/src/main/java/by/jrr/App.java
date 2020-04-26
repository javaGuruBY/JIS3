package by.jrr;

import by.jrr.bean.LookupArray;
import by.jrr.service.LookupArrayService;

public class App {
    public static void main(String[] args) {
        LookupArray lookupArray = new LookupArray();
        LookupArrayService lookupArrayService = new LookupArrayService();
        lookupArray.setArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println("lookupArrayService.findMax(lookupArray) = " + lookupArrayService.findMax(lookupArray));
        System.out.println("lookupArrayService.findMin(lookupArray) = " + lookupArrayService.findMin(lookupArray));
        System.out.println("lookupArrayService.indexOfMax(lookupArray) = " + lookupArrayService.indexOfMax(lookupArray));
        System.out.println("lookupArrayService.indexOfMin(lookupArray) = " + lookupArrayService.indexOfMin(lookupArray));
        System.out.println("lookupArrayService.indexOf(lookupArray, 5) = " + lookupArrayService.indexOf(lookupArray, 5));

    }
}
