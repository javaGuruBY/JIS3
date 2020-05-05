package by.abs.bean;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {

    private int topSpeed;
    private int currentSpeed;
    private String model;
    private String color;

    public Car() {
    }

    public Car(int topSpeed, String model, String color) {
        this.topSpeed = topSpeed;
        this.model = model;
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getModel() {
        return model;
    }

    public void  setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return topSpeed == car.topSpeed &&
                currentSpeed == car.currentSpeed &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topSpeed, currentSpeed, model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "topSpeed=" + topSpeed +
                ", currentSpeed=" + currentSpeed +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}




