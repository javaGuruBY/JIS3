package by.jrr.Tv.bean;

import java.io.Serializable;
import java.util.Objects;

public class Tv implements Serializable {
    private int currentChannel;
    private int currentVolume;
    private String manufacturer;
    private boolean isTvOn = false;

    public Tv() {
        this.currentChannel = 0;
        this.currentVolume = 0;
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

    public boolean isTvOn() {
        return isTvOn;
    }

    public void setTvOn(boolean tvOn) {
        isTvOn = tvOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel &&
                currentVolume == tv.currentVolume &&
                isTvOn == tv.isTvOn &&
                Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, manufacturer, isTvOn);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", manufacturer='" + manufacturer + '\'' +
                ", isTvOn=" + isTvOn +
                '}';
    }
}
