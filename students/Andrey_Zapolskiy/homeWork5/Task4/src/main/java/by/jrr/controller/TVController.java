package by.jrr.controller;



import by.jrr.bean.TV;
import by.jrr.service.TVService;

public class TVController extends TVService {
    private boolean controllerConnectedToTheTv;

    public boolean isControllerConnectedToTheTv() {
        return controllerConnectedToTheTv;
    }

    public void setControllerConnectedToTheTv(boolean controllerConnectedToTheTv) {
        this.controllerConnectedToTheTv = controllerConnectedToTheTv;
    }

    public TVController() {
    }

    public void nextChannelWithController(TV tv) {
        if(tv.isIfTVIsOn() && controllerConnectedToTheTv) {
            int currentChannel = tv.getCurrentChannel() + 1;
            tv.setCurrentChannel(currentChannel);
        } else {
            System.out.println("Turn on a TV, connect remote controller to the TV");
        }
    }
    public void previousChannelWithController(TV tv) {
        if(tv.isIfTVIsOn()&& controllerConnectedToTheTv ) {
            int currentChannel = tv.getCurrentChannel() - 1;
            tv.setCurrentChannel(currentChannel);
        } else {
            System.out.println("Turn on a TV, connect remote controller to the TV");
        }
    }
    public void volumeUpWithController(TV tv) {
        if (tv.isIfTVIsOn() && controllerConnectedToTheTv) {
            int currentVolume = tv.getCurrentVolume() + 1;
            tv.setCurrentVolume(currentVolume);
        } else {
            System.out.println("Turn on a TV, connect remote controller to the TV");
        }
    }
    public void volumeDownWithController(TV tv) {
        if (tv.isIfTVIsOn() && controllerConnectedToTheTv) {
            int currentVolume = tv.getCurrentVolume() - 1;
            tv.setCurrentVolume(currentVolume);
        } else {
            System.out.println("Turn on a TV, connect remote controller to the TV");
        }
    }
}
