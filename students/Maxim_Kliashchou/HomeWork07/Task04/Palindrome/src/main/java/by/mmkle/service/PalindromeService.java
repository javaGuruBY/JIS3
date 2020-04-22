package by.mmkle.service;

public class PalindromeService {
    public boolean isPalindrome(String text){
        text = text.toLowerCase();
        text = text.replaceAll("[^a-z]", "");
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) != text.charAt(text.length() - i- 1)){
                return false;
            }
        }
        return true;
    }
}
