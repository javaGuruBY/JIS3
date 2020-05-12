package by.jrr.bean;

import java.util.Objects;

public class Mammal extends Animal {
    private int valueOfLegs;

    public Mammal() {
    }

    public Mammal(int age, String color, String name, int valueOfLegs) {
        super(age, color, name);
        this.valueOfLegs = valueOfLegs;
    }
    public void markingTerritory(String name){
        System.out.println(name + " marking his territory");
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Mammal making some noise");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return valueOfLegs == mammal.valueOfLegs;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), valueOfLegs);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "valueOfLegs=" + valueOfLegs +
                '}';
    }
}
