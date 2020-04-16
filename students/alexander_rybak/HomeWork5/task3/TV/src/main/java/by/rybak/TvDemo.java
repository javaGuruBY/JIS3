package by.rybak;

import by.rybak.bean.Tv;
import by.rybak.service.TvService;

public class TvDemo {
    public static void main(String[] args) {
        Tv tv = new Tv(23,43,"Horizont");
        TvService service = new TvService();
        
        System.out.println(tv);
        service.nextChannel(tv);
        service.increaseVolume(tv);
        System.out.println(tv);
        
        service.turnOffTheTv(tv);
        service.reduceVolume(tv);
        System.out.println(tv);
    }
}
