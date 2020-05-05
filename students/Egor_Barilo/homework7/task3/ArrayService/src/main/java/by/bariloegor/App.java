package by.bariloegor;

import by.bariloegor.service.ArrayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        Logger log = LoggerFactory.getLogger(App.class);
        int[] array = arrayService.create(6);
        arrayService.fillRandomly(array);
        String printedArray = arrayService.printArray(array);
        log.info(printedArray);
        String avgResult = arrayService.avg(array) + " ";
        log.info(avgResult);
        arrayService.sort(array);
        printedArray = arrayService.printArray(array);
        log.info(printedArray);
        arrayService.swap(array);
        printedArray = arrayService.printArray(array);
        log.info(printedArray);


    }
}
