package org.example.bean;

import java.util.Objects;

public class Counter {
    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }


    public void increment(Counter counter) {
        if ((counter.getValue() + counter.getStep()) <= 100) {
            counter.setValue(counter.getValue() + counter.getStep());
        }
    }

    public void decrement(Counter counter) {
        if (counter.getValue() - counter.getStep() >= 0) {
            counter.setStep(counter.getValue() - counter.getStep());
        }
    }

    public void reset(Counter counter) {
        counter.setValue(0);
        counter.setStep(1);
    }

    public void setValue(int value) {
      if (value >= 0 && value <= 100) {
          this.value = value;
      }
    }

    public int getValue() {
        return value;
    }

    public void setStep(int step) {
        if (step >= 1 && step <= 10) {
            this.step = step;
        }
    }

    public int getStep() {
        return step;
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

