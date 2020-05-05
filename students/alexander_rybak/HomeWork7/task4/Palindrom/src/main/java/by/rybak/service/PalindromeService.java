package by.rybak.service;

public class PalindromeService {

    boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]", "");
        text = text.toLowerCase();
        char[] stringText = text.toCharArray();
        for (int i = 0; i < (stringText.length/2); i++) {
            if(stringText[i] != stringText[stringText.length-i-1]){
                return false;
            }
        }
        return true;
    }
}
