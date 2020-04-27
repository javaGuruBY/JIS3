import by.jrr.palindrom.service.PalindromService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class App {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(App.class);
        PalindromService palindromService = new PalindromService();
        String textTest = "Lev!e!;;l";
        if (palindromService.isPalindrome(textTest)) {
            logger.info("This String " + textTest + " is palindrom");
        } else {
            logger.warn("This string " + "[" + textTest + "]" + " is not palindrom");
        }

    }
}
