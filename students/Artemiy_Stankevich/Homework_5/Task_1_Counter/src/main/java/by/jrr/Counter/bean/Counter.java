package by.jrr.Counter.bean;

import java.io.Serializable;
import java.util.Objects;

public class Counter implements Serializable {
    private int value;
    private int step;


    public Counter() {
        this.value = 0;
        this.step = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) throws Exception {
        if (value >= 0 && value <= 100) {
            this.value = value;
        }
        else {
            throw new Exception("variable value can not be a less zero or biggest than 100");
        }

    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) throws Exception {
        if (step >=0 && step <= 10) {
            this.step = step;
        } else {
            throw new Exception("variable step can not be a less zero or biggest than 10");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return value == counter.value &&
                step == counter.step;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, step);
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                ", step=" + step +
                '}';
    }
}
