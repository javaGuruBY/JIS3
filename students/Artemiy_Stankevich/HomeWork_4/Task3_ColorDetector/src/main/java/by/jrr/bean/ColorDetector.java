package by.jrr.bean;

import java.io.Serializable;
import java.util.Objects;

public class ColorDetector implements Serializable {
    private int waveLength;

    public ColorDetector() {
    }

    public int getWaveLength() {
        return waveLength;
    }

    public void setWaveLength(int waveLength) {
        this.waveLength = waveLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColorDetector that = (ColorDetector) o;
        return Objects.equals(waveLength, that.waveLength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(waveLength);
    }

    @Override
    public String toString() {
        return "ColorDetector{" +
                "waveLength='" + waveLength + '\'' +
                '}';
    }
}
