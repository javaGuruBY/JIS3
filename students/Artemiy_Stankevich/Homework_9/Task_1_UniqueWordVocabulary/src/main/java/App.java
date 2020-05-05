import by.jrr.uniqueWordVocabulary.service.UniqueWordVocabulary;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        Set<String> hashSet = new HashSet<>();
        uniqueWordVocabulary.addWord(hashSet, "First");
        uniqueWordVocabulary.addWord(hashSet, "Second");
        uniqueWordVocabulary.addWord(hashSet, "Third");
        uniqueWordVocabulary.addWord(hashSet, "Third");
        uniqueWordVocabulary.getWordsCount(hashSet);
        uniqueWordVocabulary.printVocabulary(hashSet);

    }
}
