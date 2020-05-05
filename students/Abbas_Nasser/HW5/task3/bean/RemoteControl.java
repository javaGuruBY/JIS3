package bean;

import service.TvService;

public class RemoteControl extends TvService {

    private boolean controllerIsConnectedToTv;



    public void setControllerIsConnectedToTv( boolean controllerIsConnectedToTv){
        this.controllerIsConnectedToTv = controllerIsConnectedToTv;
    }

    @Override
    public void nextChannel(TV tv) {
        super.nextChannel(tv);
    }

    @Override
    public void previousChannel(TV tv) {
        super.previousChannel(tv);
    }

    @Override
    public void turnOffTv(TV tv) {
        super.turnOffTv(tv);
    }

    @Override
    public void turnOnTv(TV tv) {
        super.turnOnTv(tv);
    }

    @Override
    public void volumeDown(TV tv) {
        super.volumeDown(tv);
    }

    @Override
    public void volumeUp(TV tv) {
        super.volumeUp(tv);
    }
}
