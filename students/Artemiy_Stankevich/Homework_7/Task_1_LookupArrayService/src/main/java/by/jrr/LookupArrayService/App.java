package by.jrr.LookupArrayService;


import by.jrr.LookupArrayService.service.LookupArrayService;

public class App {
    public static void main(String[] args) {
        LookupArrayService lookupArrayService = new LookupArrayService();
        int [] arrayApp = {1,2,3,4,5,6,7,8,9,10,22};

        System.out.println("lookupArrayService.findMax(arrayApp) = " +
                lookupArrayService.findMax(arrayApp));
        System.out.println("lookupArrayService.findMin(arrayApp) = " +
                lookupArrayService.findMin(arrayApp));
        System.out.println("lookupArrayService.indexOfMax(arrayApp) = " +
                lookupArrayService.indexOfMax(arrayApp));
        System.out.println("lookupArrayService.indexOfMin(arrayApp) = " +
                lookupArrayService.indexOfMin(arrayApp));
        System.out.println("lookupArrayService.indexOf(arrayApp,22) = " +
                lookupArrayService.indexOf(arrayApp, 1));
    }
}
