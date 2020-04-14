package by.jrr.bean;

import java.io.Serializable;
import java.util.Objects;

public class LightColor implements Serializable {
    private int waveLength;

    public LightColor() {
    }

    public LightColor(int wavelength) {
        this.waveLength = wavelength;
    }

    public int getWavelength() {
        return waveLength;
    }

    public void setWavelength(int wavelength) {
        this.waveLength = wavelength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightColor that = (LightColor) o;
        return getWavelength() == that.getWavelength();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWavelength());
    }

    @Override
    public String toString() {
        return "LightColor{" +
                "wavelength=" + waveLength +
                '}';
    }
}
