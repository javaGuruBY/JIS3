package by.bariloegor.service;

public class Palindrome {
    public boolean isPalindrome(String text){
        text = text.replaceAll("[^a-zA-Z]", "");
        text = text.toLowerCase();
        char[] arrayOfString = text.toCharArray();
        char[] swappedArrayOfString = swap(text.toCharArray());
        for(int i = 0; i < arrayOfString.length; i++){
            if(arrayOfString[i] != swappedArrayOfString[i]){
                return false;
            }
        }
        return true;
    }

    public char[] swap(char[] array){
        char variableValue;
        for(int i = 0; i < array.length / 2; i++){
            variableValue = array[i];
            array[i] = array[array.length - (i+1)];
            array[array.length - (i+1)] = variableValue;
        }
        return array;
    }
}
