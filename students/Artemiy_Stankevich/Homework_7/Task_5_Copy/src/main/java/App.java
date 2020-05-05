import by.jrr.copy.service.CopyService;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger logger =  LoggerFactory.getLogger(App.class);
        CopyService copyService = new CopyService();
        int [] arrayTest = {23,52,123,66,77,89,1151};
        int [] newArray = copyService.copyInRange(arrayTest, 23, 100);
        logger.info(Arrays.toString(newArray));
    }
}
