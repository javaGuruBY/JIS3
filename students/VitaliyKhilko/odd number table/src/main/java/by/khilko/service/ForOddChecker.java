package by.khilko.service;

import java.util.ArrayList;
import java.util.List;

public class ForOddChecker {

    public void getNumbersFor(int chOne, int chTwo){
        int[] mass = new int[chTwo];
        List<Integer> massList = new ArrayList<>();
        for (int i = chOne; i <= mass.length; i++) {
            if(i % 2 == 0) {
                massList.add(i);
            }
        }
    }
}
