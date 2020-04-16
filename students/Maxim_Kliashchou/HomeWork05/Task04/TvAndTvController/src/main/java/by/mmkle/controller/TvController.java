package by.mmkle.controller;

import by.mmkle.bean.Tv;
import by.mmkle.service.TvService;

public class TvController {
    private Tv connectedTv;
    private static TvService tvService = new TvService();

    public void setConnectedTv(Tv connectedTv) {
        this.connectedTv = connectedTv;
    }

    public void nextChannel(){
        tvService.nextChannel(connectedTv);
    }

    public void previousChannel(){
        tvService.previousChannel(connectedTv);
    }

    public void volumeUp(){
        tvService.volumeUp(connectedTv);
    }

    public void volumeDown(){
        tvService.volumeDown(connectedTv);
    }

    public void tvTurnOn(){
        tvService.tvTurnOn(connectedTv);
    }

    public void tvTurnOff(){
        tvService.tvTurnOff(connectedTv);
    }
}
