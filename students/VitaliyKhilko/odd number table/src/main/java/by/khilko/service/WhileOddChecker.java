package by.khilko.service;

import java.util.ArrayList;
import java.util.List;

public class WhileOddChecker {
    public void getNumbersWhile(int chOne, int chTwo){
        int[] mass = new int[chTwo];
        List<Integer> massList = new ArrayList<>();
        int i = chOne;
        while (i <= mass.length) {
            if(i % 2 == 0) {
                massList.add(i);
            }
            i++;
        }
    }
}
