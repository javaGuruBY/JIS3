package by.jrr.bean;
import java.util.Iterator;
import java.util.Set;

public class UniqueWordVocabulary {
    int count;
    public void addWord(Set set, String word) {
        if (word != " " && word != null){
            set.add(word);
        }
    }

    public int getWordsCount(Set set) {
        return set.size();
    }

    public void printVocabulary(Set set) {
        Iterator <String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
            count ++;
        }
    }


}
