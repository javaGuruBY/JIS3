package by.jrr.TvController;

import by.jrr.TvController.bean.Tv;
import by.jrr.TvController.service.TvController;

public class App {
    public static void main(String[] args) throws Exception {
        Tv tv = new Tv();
        tv.setManufacturer("Sony");
        TvController tvController = new TvController();
        tvController.turnOnTv(tv);
        tvController.setConnectTheTvWithRemoteController(true);
        for (int i = 0; i < 10 ; i++) {
            tvController.turnOnNextChannel(tv);
            tvController.increaseSound(tv);
        }


    }
}
