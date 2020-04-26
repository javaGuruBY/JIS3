package by.jrr.service;

import by.jrr.bean.TV;

public class TvService {

    public void switchToTheNextChannel(TV tv) throws Exception {
        if (tv.isTVSwichOn() == true) {
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        } else {
            throw new Exception("The operation could not be completed. Turn on the TV.");
        }
    }

    public void switchToTheLastChannel(TV tv) throws Exception {
        if (tv.isTVSwichOn() == true) {
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        } else {
            throw new Exception("The operation could not be completed. Turn on the TV.");
        }
    }

    public void  increaseTheVolume(TV tv) throws Exception {
        if (tv.isTVSwichOn() == true) {
            tv.setCurrentVolume(tv.getCurrentVolume() +1);
        } else {
            throw new Exception("The operation could not be completed. Turn on the TV.");
        }
    }

    public void decreaseTheVolume(TV tv) throws Exception {
        if (tv.isTVSwichOn() == true) {
            tv.setCurrentVolume(tv.getCurrentVolume() -1);
        } else {
            throw new Exception("The operation could not be completed. Turn on the TV.");
        }
    }

    public void swichOnTV(TV tv){
        tv.setTVSwichOn(true);
    }

    public void swichOffTV(TV tv) {
        tv.setTVSwichOn(false);
    }
}
