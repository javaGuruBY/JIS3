package by.jrr.uniqueWordVocabulary.service;

import java.util.Iterator;
import java.util.Set;

public class UniqueWordVocabulary {
    static int count;

    public void addWord(Set set, String word) {
        if (isWordNotEmpty(word)) {
            set.add(word);
        }

    }

    public int getWordsCount(Set set) {
        return set.size();
    }
    public boolean isWordNotEmpty (String word) {
        return (!word.equals("")&& !word.equals(" "));
    }

    public void printVocabulary(Set set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
            count++;
            if (count == 15) {
                System.out.println();
            }
        }
    }
}
