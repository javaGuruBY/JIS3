package org.example;

import org.example.service.LookupArrayService;

public class App {
    public static void main(String[] args) {
        LookupArrayService service = new LookupArrayService();
        int[] array = {12,25,48,164,11,1,0,-5,18,1};
        System.out.println("service.findMax(array) = " + service.findMax(array));
        System.out.println("service.findMin(array) = " + service.findMin(array));
        System.out.println("service.indexOfMax(array) = " + service.indexOfMax(array));
        System.out.println("service.indexOfMin(array) = " + service.indexOfMin(array));
        System.out.println("service.indexOf(array, 18) = " + service.indexOf(array, 18));
    }
}
