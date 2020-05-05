package by.abs.bean;

import java.util.HashSet;
import java.util.Set;

public class UniqueVocabularyDemo {
    public static void main(String[] args) {
          Set<String> vocabulary = new HashSet<>();

        System.out.println("words = " + vocabulary);
        vocabulary.add("Apple");
        vocabulary.add("Mango");
        vocabulary.add("Pineapple");
        vocabulary.add("Watermelon");
        System.out.println("vocabulary : " + vocabulary);
        System.out.println("words.size() = " + vocabulary.size());

    }
    }

