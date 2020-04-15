package by.jrr.bean;

public class Counter {

    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }

    public void increment() {
        if(getValue()+getStep()<100){
            value +=step;
        } else clear();
    }

    public void decrement() {
        if(getValue()-getStep()>0){
            value -= step;
        } else clear();
    }

    public void clear() {
        value = 0;
        step = 1;
    }

    public void setValue(int value) {
        if(value > 0 && value <= 100) {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }

    public void setStep(int step) {
        if(step > 0 && step <= 10) {
            this.step = step;
        }
    }

    public int getStep() {
        return step;
    }

}