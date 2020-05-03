package by.khilko.bean;

import java.io.Serializable;

public class NumberRange implements Serializable{
    private int chOne;
    private int chTwo;

    public NumberRange() {
    }

    public NumberRange(int chOne, int chTwo) {
        this.chOne = chOne;
        this.chTwo = chTwo;
    }

    public int getChOne() {
        return chOne;
    }

    public void setChOne(int chOne) {
        this.chOne = chOne;
    }

    public int getChTwo() {
        return chTwo;
    }

    public void setChTwo(int chTwo) {
        this.chTwo = chTwo;
    }

    @Override
    public String toString() {
        return "NumberRange{" +
                "chOne=" + chOne +
                ", chTwo=" + chTwo +
                '}';
    }
}

