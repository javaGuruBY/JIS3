package by.khilko.Tvcontroller;

import by.khilko.bean.Tv;
import by.khilko.service.Tvservice;

public class Tvcontroller {
    private Tv workConnectTv;
    private static Tvservice service = new Tvservice();

    public void setConnectTv(Tv workConnectTv) {
        this.workConnectTv = workConnectTv;
    }

    public void newChannelTvUp(){
        service.channelUp(workConnectTv);
    }

    public void newChannelTvDown(){
        service.channelDown(workConnectTv);
    }

    public void newVolumeUp() {
        service.soundUp(workConnectTv);
    }

    public void newVolumeDown() {
        service.soundDown(workConnectTv);
    }

    public void newTurnOnTv(){
        service.turnOnTv(workConnectTv);
    }

    public void newTurnOffTv(){
        service.turnOffTv(workConnectTv);
    }
}