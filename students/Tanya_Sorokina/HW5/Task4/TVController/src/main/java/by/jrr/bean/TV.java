package by.jrr.bean;
import java.io.Serializable;
import java.util.Objects;


public class TV implements Serializable{
    private int currentChannel;
    private int currentVolume;
    private String manufacturer;
    private boolean TVSwichOn;

    public TV(){
    }

    public TV(int currentChannel, int currentVolume, String manufacturer, boolean TVSwichOn) {
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
        this.manufacturer = manufacturer;
        this.TVSwichOn = TVSwichOn;
    }


    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isTVSwichOn() {
        return TVSwichOn;
    }

    public boolean setTVSwichOn(boolean TVSwichOn) {
        this.TVSwichOn = TVSwichOn;
        return TVSwichOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return currentChannel == tv.currentChannel &&
                currentVolume == tv.currentVolume &&
                TVSwichOn == tv.TVSwichOn &&
                Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, manufacturer, TVSwichOn);
    }

    @Override
    public String toString() {
        return "TV{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", manufacturer='" + manufacturer + '\'' +
                ", TVSwichOn=" + TVSwichOn +
                '}';
    }

}

