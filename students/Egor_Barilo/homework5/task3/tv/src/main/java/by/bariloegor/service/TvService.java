package by.bariloegor.service;

import by.bariloegor.bean.Tv;

public class TvService {
    public void switchToNextChannel(Tv tv){
        if(tv.isPowerOn()) {
            tv.setCurrentChannel(tv.getCurrentChannel()+1);
        }
    }

    public void switchToPreviousChannel(Tv tv){
        if(tv.isPowerOn()) {
            tv.setCurrentChannel(tv.getCurrentChannel()-1);
        }
    }

    public void increaseVolume(Tv tv){
        if(tv.isPowerOn()) {
            tv.setCurrentVolume(tv.getCurrentVolume()+1);
        }
    }

    public void decreaseVolume(Tv tv){
        if(tv.isPowerOn()) {
            tv.setCurrentVolume(tv.getCurrentVolume()-1);
        }
    }

    public void turnOn(Tv tv){
        tv.setPowerOn(true);
    }

    public void turnOff(Tv tv){
        tv.setPowerOn(false);
    }
}
