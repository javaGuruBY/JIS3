package by.mmkle.service;

import by.mmkle.repository.UniqueWordVocabulary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UniqueWordVocabularyService {
    private Logger log = LoggerFactory.getLogger(UniqueWordVocabularyService.class);

    public void add(String word){
        if (!isVocabularyhasWord(word) && word != "" && word != null){
            UniqueWordVocabulary.vocabulary.add(word);
        }
    }

    private boolean isVocabularyhasWord(String word) {
        return UniqueWordVocabulary.vocabulary.contains(word);
    }

    public int getWordsCount(){
        return UniqueWordVocabulary.vocabulary.size();
    }

    public void printVocabulary(){
        log.info(UniqueWordVocabulary.vocabulary.toString());
    }


}
