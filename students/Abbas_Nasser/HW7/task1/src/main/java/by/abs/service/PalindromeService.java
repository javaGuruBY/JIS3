package by.abs.service;

public class PalindromeService {

    public  boolean isPalindrome(String text){
        text = text.toLowerCase();
        text = text.replaceAll("[^,A-Za-z0-9]" , "");

        for (int i = 0;i < text.length();i++){
            if (text.charAt(i) != text.charAt(text.length() -i -1)){
                return false;
            }
        }
    return true;
    }
}
