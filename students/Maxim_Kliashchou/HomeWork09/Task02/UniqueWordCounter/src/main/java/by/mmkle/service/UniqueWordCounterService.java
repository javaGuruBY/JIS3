package by.mmkle.service;

import by.mmkle.repository.UniqueWordCounter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class UniqueWordCounterService {
    private Logger log = LoggerFactory.getLogger(UniqueWordCounterService.class);

    public void add(String word){
        if (UniqueWordCounter.counter.containsKey(word)){
            UniqueWordCounter.counter.put(word, UniqueWordCounter.counter.get(word) + 1);
        } else {
            UniqueWordCounter.counter.put(word, 1);
        }
    }

    public String getMostFrequentWord(){
        int max = -1;
        String word = null;

        for (Map.Entry<String, Integer> entry : UniqueWordCounter.counter.entrySet()){
            if (entry.getValue() > max){
                max = entry.getValue();
                word = entry.getKey();
            }
        }
        return word;
    }

    public void printFrequency(){
        for (Map.Entry<String, Integer> entry : UniqueWordCounter.counter.entrySet()){
            log.info(entry.getKey() + " : " + entry.getValue());
        }
    }
}
