package by.rybak.service;

import by.rybak.bean.UniqueWordCounter;
import java.util.Map;

public class UniqueWordCounterService {
    
    UniqueWordCounter counter = new UniqueWordCounter();

    void addWord(UniqueWordCounter counter, String word) {
        counter.getMap().put(word, word);
        int count = countsTheNumberOfRepeatedLines(counter.getMap(), word);
    }

    int getMostFrequentWord(UniqueWordCounter counter) {
        int max = 0;
        for (String el: counter.getMap().values()){
            if(max < countsTheNumberOfRepeatedLines(counter.getMap(), el)){
                max = countsTheNumberOfRepeatedLines(counter.getMap(), el);
            }
        }
        return max;
    }

    void printWordsFrequency(UniqueWordCounter counter) {
        for(String el: counter.getMap().values()){
            System.out.println(el + " count - " + countsTheNumberOfRepeatedLines(counter.getMap(), el));
        }
    }

    int countsTheNumberOfRepeatedLines(Map<String, String> map, String word) {
        int counterOfWords = 0;
        for(String el: map.values()){
            if(el.equals(word)){
                counterOfWords++;
            }
        }
        return counterOfWords;
    }
}
