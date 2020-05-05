package org.example.service;

import org.example.bean.TV;
import org.example.bean.TVController;

public class TVControllerService {
    public void nextChannel(TV tv, TVController tvController){
        if (tv.isTvOn() && tvController.isConnectedTv()){
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        }
    }

    public void previousChannel(TV tv, TVController tvController){
        if (tv.isTvOn() && tvController.isConnectedTv()){
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        }
    }

    public void volumeUp(TV tv, TVController tvController){
        if (tv.isTvOn() && tvController.isConnectedTv()){
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
        }
    }

    public void volumeDown(TV tv, TVController tvController){
        if (tv.isTvOn() && tvController.isConnectedTv()){
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
        }
    }

    public void tvOn(TV tv, TVController tvController){
        if (tvController.isConnectedTv()) {
            tv.setTvOn(true);
        }
    }

    public void tvOff(TV tv, TVController tvController){
        if (tvController.isConnectedTv()) {
            tv.setTvOn(false);
        }
    }

    public void connectToTv(TVController tvController){
        tvController.setConnectedTv(true);
    }

}
