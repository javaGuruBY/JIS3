package by.bariloegor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class UniqueWordVocabularyService {
    private Logger log = LoggerFactory.getLogger(UniqueWordVocabularyService.class);

    public void addWord(Set<String> vocabulary, String word){
        if(isWordNotEmpty(word) && isWordNotDuplicate(vocabulary, word)){
            vocabulary.add(word);
        }
    }

    public boolean isWordNotEmpty(String word){
        return !word.equals("") && !word.equals(" ");
    }

    public boolean isWordNotDuplicate(Set<String> vocabulary, String word){
        return !vocabulary.contains(word);
    }

    public int getWordCount(Set<String> vocabulary){
        return vocabulary.size();
    }

    public void printVocabulary(Set<String> vocabulary){
        String vocabularyWords = vocabulary.toString();
        log.info(vocabularyWords);
    }
}
