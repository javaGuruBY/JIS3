package by.bariloegor.bean;

import java.util.Objects;

public class Mammal extends Animal{
    protected String woolColor;

    public Mammal() {
    }

    public Mammal(String name, String gender, String woolColor) {
        super(name, gender);
        this.woolColor = woolColor;
    }

    public Mammal(String woolColor) {
        this.woolColor = woolColor;
    }

    public String getWoolColor() {
        return woolColor;
    }

    public void setWoolColor(String woolColor) {
        this.woolColor = woolColor;
    }

    @Override
    public String eat(){
        return name + " eat meat ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return Objects.equals(woolColor, mammal.woolColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), woolColor);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "woolColor='" + woolColor + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
