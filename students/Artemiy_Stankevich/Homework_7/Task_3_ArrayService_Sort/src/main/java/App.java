import by.jrr.arrayServiceSort.service.ArrayServiceSort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Logger logger =  LoggerFactory.getLogger(App.class);
        ArrayServiceSort arrayServiceSort = new ArrayServiceSort();
        int[] arrayTest = arrayServiceSort.create(20);
        arrayServiceSort.fillRandomly(arrayTest);
        arrayServiceSort.printArray(arrayTest);
        System.out.println();
        logger.info("Sum all index in array is equals to " + arrayServiceSort.sum(arrayTest));
        logger.info("Avg value all index in array is equals to  " + arrayServiceSort.avg(arrayTest));

        int[] arraySwap = {3, 4, 7, 0, 2, 6, 9};
        arrayServiceSort.swap(arraySwap);
        logger.info(Arrays.toString(arraySwap));
        int[] arraySort = {3, 4, 7, 0, 2, 6, 9};
        arrayServiceSort.sort(arraySort);
        logger.info(Arrays.toString(arraySort));


    }
}
