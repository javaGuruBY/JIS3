package service;

import bean.TV;

public class TvService {

    public void turnOnTv(TV tv){
        tv.setPowerOn(true);
    }

    public void turnOffTv(TV tv){
        tv.setPowerOn(false);
}

    public void nextChannel(TV tv){
        if (tv.isPowerOn()) {
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        }
    }

    public void previousChannel(TV tv){
        if (tv.isPowerOn()) {
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        }
    }

    public void volumeUp(TV tv){
        if (tv.isPowerOn()) {
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
        }
    }

    public void volumeDown(TV tv){
        if (tv.isPowerOn()) {
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
        }
    }
}