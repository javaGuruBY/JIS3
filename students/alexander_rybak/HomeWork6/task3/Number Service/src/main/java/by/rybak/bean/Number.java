package by.rybak.bean;

import java.io.Serializable;
import java.util.Objects;

public class Number implements Serializable {
    private int start;
    private int end;

    public Number() {
    }

    public Number(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        return start == number.start &&
                end == number.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public String toString() {
        return "Number{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
