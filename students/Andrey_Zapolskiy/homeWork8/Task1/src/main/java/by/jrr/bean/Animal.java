package by.jrr.bean;

import java.io.Serializable;
import java.util.Objects;

public class Animal implements Serializable {
    private boolean voiceIsOn;
    private boolean eatIsOn;
    private boolean sleepIsOn;
    private int age;
    private String color;
    private String name;

    public Animal() {
    }

    public Animal(int age, String color, String name) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public boolean isVoiceIsOn() {
        return voiceIsOn;
    }

    public void setVoiceIsOn(boolean voiceIsOn) {
        this.voiceIsOn = voiceIsOn;
    }

    public boolean isEatIsOn() {
        return eatIsOn;
    }

    public void setEatIsOn(boolean eatIsOn) {
        this.eatIsOn = eatIsOn;
    }

    public boolean isSleepIsOn() {
        return sleepIsOn;
    }

    public void setSleepIsOn(boolean sleepIsOn) {
        this.sleepIsOn = sleepIsOn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void voice() {
        this.voiceIsOn = true;

    }
    public void eat(){
        this.eatIsOn = true;

    }
    public void sleep(){
        this.sleepIsOn = true;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return isVoiceIsOn() == animal.isVoiceIsOn() &&
                isEatIsOn() == animal.isEatIsOn() &&
                isSleepIsOn() == animal.isSleepIsOn() &&
                getAge() == animal.getAge() &&
                Objects.equals(getColor(), animal.getColor()) &&
                Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(isVoiceIsOn(), isEatIsOn(), isSleepIsOn(), getAge(), getColor(), getName());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "voiceIsOn=" + voiceIsOn +
                ", eatIsOn=" + eatIsOn +
                ", sleepIsOn=" + sleepIsOn +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
