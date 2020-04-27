package by.jrr.palindrom.service;

public class PalindromService {

    public boolean isPalindrome(String text) {
        text = text.replaceAll("[^A-Za-z]", "").toLowerCase();
        char [] str1 = text.toCharArray();
        char [] str2 = reversArray(text.toCharArray());
        for (int i = 0; i < str1.length-1; i++) {
            if(str1[i] != str2[i]) {
                return false;
            }
        }return true;
    }
    public char [] reversArray (char [] array) {
        char swap;
        for (int i = 0, j = array.length-1; i < (array.length - 1)/2; i++,j--) {
            if (i == j) break;
            swap = array[i];
            array[i] = array[j];
            array[j] = swap;
        } return  array;
    }
}
