package by.jrr.uniqueWordCounter.service;

import by.jrr.uniqueWordCounter.collection.UniqueWordCounter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class UniqueWordCounterService {
    Logger logger = LoggerFactory.getLogger(UniqueWordCounterService.class);
    public void addWord(String word) {
        if(UniqueWordCounter.counterMap.containsKey(word)) {
            UniqueWordCounter.counterMap.put(word, UniqueWordCounter.counterMap.get(word) + 1);

        } else {
            UniqueWordCounter.counterMap.put(word, 1);
        }
    }

    public String getMostFrequentWord() {
        int maxValue = 0;
        String word = null;
        for(Map.Entry<String, Integer> entry: UniqueWordCounter.counterMap.entrySet()){
            if(entry.getValue() >  maxValue) {
                maxValue = entry.getValue();
                word = entry.getKey();
            }
        } return word;
    }

    public void printWordsFrequency() {
        for(Map.Entry entry: UniqueWordCounter.counterMap.entrySet()) {
            logger.info(entry.getKey() + ": " + entry.getValue());
        }
    }
}
