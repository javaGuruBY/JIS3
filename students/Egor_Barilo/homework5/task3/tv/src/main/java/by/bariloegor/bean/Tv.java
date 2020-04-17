package by.bariloegor.bean;

import java.io.Serializable;
import java.util.Objects;

public class Tv implements Serializable {
    private int currentChannel;
    private int currentVolume;
    private String tvManufacturer;
    private boolean powerOn;

    public Tv() {
    }

    public Tv(int currentChannel, int currentVolume, String tvManufacturer) {
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
        this.tvManufacturer = tvManufacturer;
        this.powerOn = false;
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

    public String getTvManufacturer() {
        return tvManufacturer;
    }

    public void setTvManufacturer(String tvManufacturer) {
        this.tvManufacturer = tvManufacturer;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel &&
                currentVolume == tv.currentVolume &&
                powerOn == tv.powerOn &&
                Objects.equals(tvManufacturer, tv.tvManufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, tvManufacturer, powerOn);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", tvManufacturer='" + tvManufacturer + '\'' +
                ", powerOn=" + powerOn +
                '}';
    }
}
