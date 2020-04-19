package by.bariloegor.tv.service;

import by.bariloegor.tv.bean.Tv;

public class TvController {
    private Tv connectedTv;

    public void connectToTv(Tv tv){
        this.connectedTv = tv;
    }

    public void switchToNextChannel(){
        if(connectedTv.isPowerOn()) {
            connectedTv.setCurrentChannel(connectedTv.getCurrentChannel()+1);
        }
    }

    public void switchToPreviousChannel(){
        if(connectedTv.isPowerOn()) {
            connectedTv.setCurrentChannel(connectedTv.getCurrentChannel()-1);
        }
    }

    public void increaseVolume(){
        if(connectedTv.isPowerOn()) {
            connectedTv.setCurrentVolume(connectedTv.getCurrentVolume()+1);
        }
    }

    public void decreaseVolume(){
        if(connectedTv.isPowerOn()) {
            connectedTv.setCurrentVolume(connectedTv.getCurrentVolume()-1);
        }
    }

    public void turnOn(){
        connectedTv.setPowerOn(true);
    }

    public void turnOff(){
        connectedTv.setPowerOn(false);
    }
}
