package org.example.service;

import org.example.bean.TV;

public class TVService {
    public void nextChannel(TV tv){
        if (tv.isTvOn()){
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        }
    }

    public void previousChannel(TV tv){
        if (tv.isTvOn()){
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        }
    }

    public void volumeUp(TV tv){
        if (tv.isTvOn()){
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
        }
    }

    public void volumeDown(TV tv) {
        if (tv.isTvOn()) {
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
        }
    }

    public void tvOn(TV tv){
        tv.setTvOn(true);
    }

    public void tvOff(TV tv){
        tv.setTvOn(false);
    }
}
