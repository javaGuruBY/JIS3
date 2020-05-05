package by.jrr.Tv.service;

import by.jrr.Tv.bean.Tv;

public class TvService {
    public void turnOnNextChannel(Tv tv) throws Exception {
        if (tv.isTvOn() == true) {
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        } else {
            throw new Exception("Tv off. Please turn Tv");
        }
    }
    public void turnOnPreviousChannel(Tv tv) throws Exception {
        if (tv.isTvOn() == true) {
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        } else {
            throw new Exception("Tv off. Please turn Tv");
        }
    }
    public void increaseSound(Tv tv) throws Exception {
        if (tv.isTvOn() == true) {
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
        } else {
            throw new Exception("Tv off. Please turn Tv");
        }
    }
    public void decreaseSound(Tv tv) throws Exception {
        if (tv.isTvOn() == true) {
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
        } else {
            throw new Exception("Tv off. Please turn Tv");
        }
    }
    public void turnOnTv(Tv tv) {
        tv.setTvOn(true);
    }
    public void turnOffTv(Tv tv) {
        tv.setTvOn(false);
    }
}
