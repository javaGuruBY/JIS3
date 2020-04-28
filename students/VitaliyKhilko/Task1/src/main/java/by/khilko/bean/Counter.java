package by.khilko.bean;

public class Counter {
    private int value;
    private int step;

    public Counter() {
    }

    public Counter(int value, int step) {
        this.value = value;
        this.step = step;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if(value >= 0 && value <= 100){
            this.value = value;
        }
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        if(step >= 1 && step <= 10){
            this.step = step;
        }
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                ", step=" + step +
                '}';
    }
}
