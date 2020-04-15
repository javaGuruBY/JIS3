package by.jrr.bean;

import java.io.Serializable;
import java.util.Objects;

public class SingComparator implements Serializable {
    private int number;

    public SingComparator() {
    }

    public SingComparator(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SingComparator that = (SingComparator) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "SingComparator{" +
                "number=" + number +
                '}';
    }
}
