package by.rybak.bean;

import java.io.Serializable;
import java.util.Objects;

public class Counter implements Serializable {
    private int value = 0;
    private int step = 0;

    public Counter() {
    }

    public Counter(int value, int step) {
        if(value >=0 && step >=0) {
            this.value = value;
            this.step = step;
        }
        else{
            System.out.println("Not right data was written!");
            System.out.println("your step and value = 0!");
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
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
