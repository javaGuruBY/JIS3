package by.mmkle.bean;

import java.util.Objects;

public class Bird extends Animal {
    private int flySpeed;

    public Bird(String name, int age, int flySpeed) {
        super(name, age);
        this.flySpeed = flySpeed;
    }

    public int getFlySpeed() {
        return flySpeed;
    }

    public void setFlySpeed(int flySpeed) {
        this.flySpeed = flySpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return flySpeed == bird.flySpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flySpeed);
    }

    @Override
    public String toString() {
        return "Birds{" +
                "flySpeed='" + flySpeed + '\'' +
                ", name='" + this.getName() + '\'' +
                ", age=" + this.getAge() +
                '}';
    }
}
