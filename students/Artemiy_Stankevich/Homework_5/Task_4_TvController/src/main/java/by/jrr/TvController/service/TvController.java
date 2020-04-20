package by.jrr.TvController.service;

import by.jrr.TvController.bean.Tv;

public class TvController implements TvService {
    Tv tv = new Tv();
    private boolean connectTheTvWithRemoteController;

    public boolean isConnectTheTvWithRemoteController() {
        return connectTheTvWithRemoteController;
    }

    public void setConnectTheTvWithRemoteController(boolean connectTheTvWithRemoteController) {
        this.connectTheTvWithRemoteController = connectTheTvWithRemoteController;
    }

    @Override
    public void turnOnNextChannel(Tv tv) throws Exception {
        if (tv.isTvOn() && isConnectTheTvWithRemoteController()) {
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        } else {
            throw new Exception("Tv off. Please turn Tv");
        }
    }

    @Override
    public void turnOnPreviousChannel(Tv tv) throws Exception {
        if (tv.isTvOn() && isConnectTheTvWithRemoteController()) {
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        } else {
            throw new Exception("Tv off. Please turn Tv");
        }
    }

    @Override
    public void increaseSound(Tv tv) throws Exception {
        if (tv.isTvOn() && isConnectTheTvWithRemoteController()) {
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
        } else {
            throw new Exception("Tv off. Please turn Tv");
        }
    }

    @Override
    public void decreaseSound(Tv tv) throws Exception {
        if (tv.isTvOn() && isConnectTheTvWithRemoteController()) {
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
        } else {
            throw new Exception("Tv off. Please turn Tv");
        }
    }

    @Override
    public void turnOnTv(Tv tv) {
        if(isConnectTheTvWithRemoteController()) tv.setTvOn(true);
    }

    @Override
    public void turnOffTv(Tv tv) {
        if(isConnectTheTvWithRemoteController()) tv.setTvOn(false);
    }
}
