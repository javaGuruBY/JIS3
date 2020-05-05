package by.mmkle.bean;

import by.mmkle.interfaces.Shape;

public abstract class AbstractShape implements Shape {
    protected int numOfAngles;
    protected String name;

    public AbstractShape() {
    }

    public AbstractShape(int numOfAngles, String name) {
        this.numOfAngles = numOfAngles;
        this.name = name;
    }

    public int getNumOfAngles() {
        return numOfAngles;
    }

    public void setNumOfAngles(int numOfAngles) {
        this.numOfAngles = numOfAngles;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
