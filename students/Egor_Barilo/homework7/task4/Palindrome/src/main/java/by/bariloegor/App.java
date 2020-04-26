package by.bariloegor;

import by.bariloegor.service.Palindrome;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome("L   Ev? '''}}}[]qqewqeqweeL");
        if(result) {
            log.info("String is palindrome.");
        } else log.warn("String is not palindrome.");

    }
}
