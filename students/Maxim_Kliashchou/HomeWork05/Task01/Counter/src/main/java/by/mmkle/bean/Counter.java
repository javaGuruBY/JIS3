package by.mmkle.bean;

import java.io.Serializable;
import java.util.Objects;

public class Counter implements Serializable {
    private int value;
    private int step;

    public Counter() {
        value = 0;
        step = 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (isValueInRange(value)){
            this.value = value;
        }
    }

    private boolean isValueInRange(int value) {
        return (value >= 0 && value <= 100);
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        if (isStepInRange(step)) {
            this.step = step;
        }
    }

    private boolean isStepInRange(int step) {
        return (step >= 0 && step <= 10);
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
