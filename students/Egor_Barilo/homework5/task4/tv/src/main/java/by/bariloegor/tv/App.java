package by.bariloegor.tv;

import by.bariloegor.tv.bean.Tv;
import by.bariloegor.tv.service.TvController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);
        TvController tvController = new TvController();
        Tv firstTv = new Tv(1, 20, "Samsung");
        tvController.connectToTv(firstTv);
        tvController.turnOn();
        tvController.switchToNextChannel();
        tvController.decreaseVolume();
        String info = firstTv.toString();
        log.info(info);
    }
    }

