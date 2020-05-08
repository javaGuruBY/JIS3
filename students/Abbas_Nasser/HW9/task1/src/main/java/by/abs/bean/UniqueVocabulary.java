package by.abs.bean;

import java.util.HashSet;
import java.util.Set;

public class UniqueVocabulary {

    public static Set<String> vocabulary = new HashSet<>();


    public void addWord(String word) {
        if (word != " " && word != null){
            UniqueVocabulary.vocabulary.add(word);
        }
    }

    public int getWordsCount() {
        return UniqueVocabulary.vocabulary.size();

    }

    public void printVocabulary() {
        System.out.println(UniqueVocabulary.vocabulary.toString());

    }

}
