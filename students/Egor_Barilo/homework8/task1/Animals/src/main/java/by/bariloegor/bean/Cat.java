package by.bariloegor.bean;

import java.util.Objects;

public class Cat extends Mammal{
    private int agilityLevel;

    public Cat(String name, String gender, String woolColor, int agilityLevel) {
        super(name, gender, woolColor);
        this.agilityLevel = agilityLevel;
    }

    public Cat() {
    }

    public int getAgilityLevel() {
        return agilityLevel;
    }

    public void setAgilityLevel(int agilityLevel) {
        this.agilityLevel = agilityLevel;
    }

    @Override
    public String eat(){
        return name + " eat fish";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return agilityLevel == cat.agilityLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), agilityLevel);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "agilityLevel=" + agilityLevel +
                ", woolColor='" + woolColor + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
