package by.rybak.bean;

import by.rybak.service.TvService;

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

    public void increaseVolume(){
        tvService.increaseVolume(connectedTv);
    }

    public void reduceVolume(){
        tvService.reduceVolume(connectedTv);
    }

    public void turnOnTheTv(){
        tvService.turnOnTheTv(connectedTv);
    }

    public void turnOffTheTv(){
        tvService.turnOffTheTv(connectedTv);
    }
}

