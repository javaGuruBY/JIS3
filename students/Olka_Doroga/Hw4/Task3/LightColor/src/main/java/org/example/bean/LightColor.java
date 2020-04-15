package org.example.bean;

import java.io.Serializable;
import java.util.Objects;

public class LightColor implements Serializable {
    private int wavelength;

    public LightColor() {
    }

    public LightColor(int wavelength) {
        this.wavelength = wavelength;
    }

    public int getWavelength() {
        return wavelength;
    }

    public void setWavelength(int wavelength) {
        this.wavelength = wavelength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LightColor that = (LightColor) o;
        return wavelength == that.wavelength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wavelength);
    }

    @Override
    public String toString() {
        return "LightColor{" +
                "wavelength=" + wavelength +
                '}';
    }
}
