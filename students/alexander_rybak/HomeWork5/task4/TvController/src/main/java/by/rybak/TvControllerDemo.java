package by.rybak;

import by.rybak.bean.Tv;
import by.rybak.bean.TvController;

public class TvControllerDemo {
    public static void main(String[] args) {
        TvController controller = new TvController();
        Tv tv = new Tv(23,45,"Horizont");

        controller.setConnectedTv(tv);
        controller.increaseVolume();
        controller.turnOnTheTv();
        controller.nextChannel();
        System.out.println(tv);
    }
}
