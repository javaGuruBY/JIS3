package by.bariloegor;

import by.bariloegor.service.Copy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);
        Copy copy = new Copy();
        int[] array = {0,1,2,3,4,9,9,9,9,9,13,1,575,345,2};
        int[] newArray = copy.copyInRange(array, 5,9);
        for (int value : newArray) {
            String numberOfNewArray = value + " ";
            log.info(numberOfNewArray);
        }
    }

}
