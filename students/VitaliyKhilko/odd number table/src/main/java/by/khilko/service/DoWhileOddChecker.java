package by.khilko.service;

import java.util.ArrayList;
import java.util.List;

public class DoWhileOddChecker {
    public void getNumbersDoWhile(int chOne, int chTwo){
            int[] mass = new int[chTwo];
            List<Integer> massList = new ArrayList<>();
            int i = chOne;
            do{
                if(i % 2 == 0) {
                    massList.add(i);
                }
                i++;
            } while (i <= mass.length);
    }
}

