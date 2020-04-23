import by.rybak.service.ArrayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class ArrayDemo {
    
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(ArrayDemo.class);
        ArrayService  service = new ArrayService();
        
        int[] mas = {5,4,2,6,8,1,5,7,0,-1,4};
       log.info(Arrays.toString(mas));
        
        service.sort(mas);
        log.info(Arrays.toString(mas));

        service.swap(mas);
        log.info(Arrays.toString(mas));
    }
}
