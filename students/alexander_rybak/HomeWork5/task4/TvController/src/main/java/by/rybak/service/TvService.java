package by.rybak.service;

import by.rybak.bean.Tv;

public class TvService {
    Tv tv = new Tv(12, 23, "Horizont");

    public void nextChannel(Tv tv) {
        if (tv.isOn()) {
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        } else {
            System.out.println("tv is off");
        }
    }

    public void previousChannel(Tv tv) {
        if (tv.isOn()) {
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        } else {
            System.out.println("Tv is off");
        }
    }

    public void increaseVolume(Tv tv) {
        if (tv.isOn()) {
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
        } else {
            System.out.println("tV is off");
        }
    }

    public void reduceVolume(Tv tv) {
        if (tv.isOn()) {
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
        } else {
            System.out.println("tv is off");
        }
    }

    public void turnOnTheTv(Tv tv) {
        tv.setOn(true);
    }

    public void turnOffTheTv(Tv tv) {
        tv.setOn(false);
    }
}
