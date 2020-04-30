package by.bariloegor.service;

import by.bariloegor.repository.UniqueWordCounter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class UniqueWordCounterService {
        Logger log = LoggerFactory.getLogger(UniqueWordCounterService.class);

        public void addWord(String word){
            if(isVocabularyContainWord(word)){
                int numberOfRepetitionsOfWord = UniqueWordCounter.wordCounter.get(word);
                UniqueWordCounter.wordCounter.put(word, numberOfRepetitionsOfWord + 1);
            } else {
                UniqueWordCounter.wordCounter.put(word, 1);
            }
        }

        public boolean isVocabularyContainWord(String word){
            return UniqueWordCounter.wordCounter.containsKey(word);
        }

        public String getMostFrequentWord(){
            int valueOfMostFrequentWord = 0;
            String mostFrequentWord = null;
            for(Map.Entry<String, Integer> entry : UniqueWordCounter.wordCounter.entrySet()){
                if(entry.getValue() > valueOfMostFrequentWord){
                    valueOfMostFrequentWord = entry.getValue();
                    mostFrequentWord = entry.getKey();
                }
            }
            return mostFrequentWord;
        }

        public void printWordsFrequency(){
            for(Map.Entry<String,Integer> entry : UniqueWordCounter.wordCounter.entrySet()){
                String wordFrequency = "'" + entry.getKey() + "' was used " + entry.getValue() + " times.";
                log.info(wordFrequency);
            }
        }
    }
