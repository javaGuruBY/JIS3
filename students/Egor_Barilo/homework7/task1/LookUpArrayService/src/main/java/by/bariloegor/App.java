package by.bariloegor;

import by.bariloegor.service.LookupArrayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);
        LookupArrayService lookupArrayService = new LookupArrayService();
        int[] array = {29,723,50,888,1000};
        int max = lookupArrayService.findMax(array);
        int min = lookupArrayService.findMin(array);
        int indexOfMax = lookupArrayService.indexOfMax(array);
        int indexOfMin = lookupArrayService.indexOfMin(array);
        int indexOf = lookupArrayService.indexOf(array, 888);
        log.info(max + " " + min + " " + indexOfMax + " " + indexOfMin + " " + indexOf);
    }
}
