package by.bariloegor;

import by.bariloegor.service.UniqueWordVocabularyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(UniqueWordVocabularyService.class);
        UniqueWordVocabularyService uniqueWordVocabularyService = new UniqueWordVocabularyService();
        Set<String> vocabulary = new HashSet<>();
        uniqueWordVocabularyService.addWord(vocabulary, "Mom");
        uniqueWordVocabularyService.addWord(vocabulary, "Dad");
        uniqueWordVocabularyService.addWord(vocabulary, "Son");
        uniqueWordVocabularyService.addWord(vocabulary,"Mom");
        uniqueWordVocabularyService.addWord(vocabulary, " ");
        String countOfUniqueWords = Integer.toString(uniqueWordVocabularyService.getWordCount(vocabulary));
        log.info(countOfUniqueWords);
        uniqueWordVocabularyService.printVocabulary(vocabulary);
    }
}
