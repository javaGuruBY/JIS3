package by.jrr;
import by.jrr.service.PalindromeService;
public class App {
    public static void main(String[] args) {
        PalindromeService palindromeService = new PalindromeService();
        String text = "А роза упала на лапу Азора";
        System.out.println("Заданный текст - " +text);
        palindromeService.isPalindrome(text);
        String text2 = "lev//1el.,!";
        System.out.println("Заданный текст - " +text2);
        palindromeService.isPalindrome(text2);

    }
}
