package by.khilko.service;


import by.khilko.bean.Tv;

public class Tvservice {

    public void channelUp(Tv myTv) {
        if (myTv.isWorksTv()) {
            myTv.setChannelTv(myTv.getChannelTv() + 1);
        }
    }

    public void channelDown(Tv myTv) {
        if (myTv.isWorksTv()) {
            myTv.setChannelTv(myTv.getChannelTv() - 1);
        }
    }

    public void soundUp(Tv myTv) {
        if (myTv.isWorksTv()) {
            myTv.setSoundTv(myTv.getSoundTv() + 1);
        }
    }

    public void soundDown(Tv myTv) {
        if (myTv.isWorksTv()) {
            myTv.setSoundTv(myTv.getSoundTv() - 1);
        }
    }

    public void turnOnTv(Tv myTv){
        myTv.setWorksTv(true);
    }

    public void turnOffTv(Tv myTv){
        myTv.setWorksTv(false);
    }

}
