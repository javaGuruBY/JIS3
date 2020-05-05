package by.khilko.service;

import by.khilko.bean.TV;

public class TvService {

    public void channelUp(TV myTv) {
        if (myTv.isWorksTv()) {
            myTv.setChannelTv(myTv.getChannelTv() + 1);
        }
    }

    public void channelDown(TV myTv) {
        if (myTv.isWorksTv()) {
            myTv.setChannelTv(myTv.getChannelTv() - 1);
        }
    }

    public void soundUp(TV myTv) {
        if (myTv.isWorksTv()) {
            myTv.setSoundTv(myTv.getSoundTv() + 1);
        }
    }

    public void soundDown(TV myTv) {
        if (myTv.isWorksTv()) {
            myTv.setSoundTv(myTv.getSoundTv() - 1);
        }
    }

    public void turnOnTv(TV myTv){
        myTv.setWorksTv(true);
    }

    public void turnOffTv(TV myTv){
        myTv.setWorksTv(false);
    }

}

