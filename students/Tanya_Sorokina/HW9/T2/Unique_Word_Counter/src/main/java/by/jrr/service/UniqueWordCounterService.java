package by.jrr.service;
import by.jrr.bean.UniqueWordCounter;

import java.util.Map;

//     void addWord(String word) - добавляет строку и считает количество раз, которое она была добавлена;
//    int getMostFrequentWord() - возвращает строку, которая была добавлена чаще всего;
//    void printWordsFrequency() - печатает на экран содержимое коллекции, а также количество раз, которое слово было добавлено;

public class UniqueWordCounterService {

    public void addWord(String word){
        if (UniqueWordCounter.counter.containsKey(word)) {
            UniqueWordCounter.counter.put(word, UniqueWordCounter.counter.get(word)+1);
        } else {
            UniqueWordCounter.counter.put(word, 1);
        }
    }

    public String getMostFrequentWord() {
        int max = -1;
        String word = null;

        for (Map.Entry<String, Integer> entry : UniqueWordCounter.counter.entrySet()) {
            if (entry.getValue() > max){
                max = entry.getValue();
                word = entry.getKey();
            }
        }System.out.println("The most often added word - "+word);
        return word;

    }

    public void printWordsFrequency(){
       for (Map.Entry<String, Integer> entry : UniqueWordCounter.counter.entrySet()) {
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }
    }
}
