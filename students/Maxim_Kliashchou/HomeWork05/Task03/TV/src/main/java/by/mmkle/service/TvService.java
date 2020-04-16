package by.mmkle.service;

import by.mmkle.bean.Tv;

public class TvService {
    public void nextChannel(Tv tv){
        if (tv.isPowerOn()) {
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        }
    }

    public void previousChannel(Tv tv){
        if (tv.isPowerOn()) {
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        }
    }

    public void volumeUp(Tv tv){
        if (tv.isPowerOn()) {
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
        }
    }

    public void volumeDown(Tv tv){
        if (tv.isPowerOn()) {
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
        }
    }

    public void tvTurnOn(Tv tv){
        tv.setPowerOn(true);
    }

    public void tvTurnOff(Tv tv){
        tv.setPowerOn(false);
    }
}
