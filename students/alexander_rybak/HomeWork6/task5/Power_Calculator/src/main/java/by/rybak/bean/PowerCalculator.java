package by.rybak.bean;

import java.io.Serializable;
import java.util.Objects;

public class PowerCalculator implements Serializable {
    private double number;

    public PowerCalculator() {
    }

    public PowerCalculator(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PowerCalculator that = (PowerCalculator) o;
        return Double.compare(that.number, number) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "PowerCalculator{" +
                "number=" + number +
                '}';
    }
}
