package service;
import bean.SignComparator;
import  static java.lang.Math.random;
import  static java.lang.Math.floor;

public class SignComparatorService {

    public int getSignComparatorRandom(SignComparator sign){
        System.out.println("-----------------------------------------");
        int num = (int)Math.floor(Math.random() * (10 - (Math.random() * 20)));
        sign.setSignComparator(num);
        System.out.println("This is random number = " + sign.getSignComparator());
        return sign.getSignComparator();
    }
}
