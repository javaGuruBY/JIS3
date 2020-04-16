package by.jrr.service;

import by.jrr.bean.TV;

public class TVService {

    public void nextChannel(TV tv) {
        if(tv.isIfTVIsOn()) {
            int currentChannel = tv.getCurrentChannel() + 1;
            tv.setCurrentChannel(currentChannel);
        } else {
            System.out.println("Turn on a TV");
        }
    }
    public void previousChannel(TV tv) {
        if(tv.isIfTVIsOn()) {
            int currentChannel = tv.getCurrentChannel() - 1;
            tv.setCurrentChannel(currentChannel);
        } else {
            System.out.println("Turn on a TV");
        }
    }
    public void volumeUp(TV tv) {
        if (tv.isIfTVIsOn()) {
            int currentVolume = tv.getCurrentVolume() + 1;
            tv.setCurrentVolume(currentVolume);
        } else {
            System.out.println("Turn on a TV");
        }
    }
    public void volumeDown(TV tv) {
        if (tv.isIfTVIsOn()) {
            int currentVolume = tv.getCurrentVolume() - 1;
            tv.setCurrentVolume(currentVolume);
        } else {
            System.out.println("Turn on a TV");
        }
    }


}
