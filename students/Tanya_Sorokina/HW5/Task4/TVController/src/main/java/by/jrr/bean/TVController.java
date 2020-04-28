package by.jrr.bean;
import java.util.Objects;


public class TVController implements TVServiceInterface{
    private boolean connectedTvWithController;

    public boolean isConnectedTvWithController() {
        return connectedTvWithController;
    }

    public void setConnectedTvWithController(boolean connectedTvWithController) {
        this.connectedTvWithController = connectedTvWithController;
    }


    @Override
    public void switchToTheNextChannel(TV tv) throws Exception {
        if (tv.isTVSwichOn() && isConnectedTvWithController()) {
            tv.setCurrentChannel(tv.getCurrentChannel() + 1);
        } else {
            throw new Exception("The operation could not be completed. Turn on the TV.");
        }
    }

    @Override
    public void switchToTheLastChannel(TV tv) throws Exception {
        if (tv.isTVSwichOn() && isConnectedTvWithController()) {
            tv.setCurrentChannel(tv.getCurrentChannel() - 1);
        } else {
            throw new Exception("The operation could not be completed. Turn on the TV.");
        }
    }

    @Override
    public void increaseTheVolume(TV tv) throws Exception {
        if (tv.isTVSwichOn() && isConnectedTvWithController()) {
            tv.setCurrentVolume(tv.getCurrentVolume() +1);
        } else {
            throw new Exception("The operation could not be completed. Turn on the TV.");
        }
    }

    @Override
    public void decreaseTheVolume(TV tv) throws Exception {
        if (tv.isTVSwichOn() && isConnectedTvWithController()) {
            tv.setCurrentVolume(tv.getCurrentVolume() -1);
        } else {
            throw new Exception("The operation could not be completed. Turn on the TV.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TVController that = (TVController) o;
        return connectedTvWithController == that.connectedTvWithController;
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectedTvWithController);
    }
}
