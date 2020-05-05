package by.ryba.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabularyService {
    Logger log = LoggerFactory.getLogger(UniqueWordVocabularyService.class);

    public void addWord(Set<String> set, String word) {
        if(!set.contains(word)){
            set.add(word);
        }
    }

    public int getWordsCount(Set<String> set) {
        return set.size();
    }

    public void printVocabulary(Set<String> set) {
        log.info(String.valueOf(set));
    }

}
