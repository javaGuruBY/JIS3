package by.jrr;

import by.jrr.bean.UniqueWordVocabulary;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> myVocabulary = new HashSet<>();
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        uniqueWordVocabulary.addWord(myVocabulary, "Uno");
        uniqueWordVocabulary.addWord(myVocabulary, "Dos");
        uniqueWordVocabulary.addWord(myVocabulary, "Tress");
        uniqueWordVocabulary.addWord(myVocabulary, "One");
        uniqueWordVocabulary.addWord(myVocabulary, " ");
        uniqueWordVocabulary.addWord(myVocabulary, "Two ");
        uniqueWordVocabulary.addWord(myVocabulary, "Three");
        uniqueWordVocabulary.addWord(myVocabulary, null);
        System.out.println("WordsCount = " + uniqueWordVocabulary.getWordsCount(myVocabulary));
        uniqueWordVocabulary.printVocabulary(myVocabulary);
    }
}
