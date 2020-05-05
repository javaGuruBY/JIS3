package by.jrr.bean;

import java.io.Serializable;
import java.util.Objects;

public class TV implements Serializable {
    private int currentChannel;
    private int currentVolume;
    private String manufacturer;
    private boolean ifTVIsOn;

    public TV() {
    }

    public TV(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public TV(String manufacturer) {
        this.manufacturer = manufacturer;
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

    public boolean isIfTVIsOn() {
        return ifTVIsOn;
    }

    public void setIfTVIsOn(boolean ifTVIsOn) {
        this.ifTVIsOn = ifTVIsOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return getCurrentChannel() == tv.getCurrentChannel() &&
                getCurrentVolume() == tv.getCurrentVolume() &&
                isIfTVIsOn() == tv.isIfTVIsOn() &&
                Objects.equals(getManufacturer(), tv.getManufacturer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCurrentChannel(), getCurrentVolume(), getManufacturer(), isIfTVIsOn());
    }

    @Override
    public String toString() {
        return "TV{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", manufacturer='" + manufacturer + '\'' +
                ", ifTVIsOn=" + ifTVIsOn +
                '}';
    }
}