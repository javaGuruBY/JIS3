package by.jrr.bean;
import java.util.Objects;

public class Dog implements java.io.Serializable {

    private String name;
    private int age;
    private String  color;

    public Dog() {
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void setName(String name) {
        if (name.equals("")) this.name = name; else System.out.println("Ошибка: Собака должна быть с именем");
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0) this.age = age; else System.out.println("Ошибка: возраст собаки не может быть отрицательным");
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        if (color.equals("")) this.color = color;
        else System.out.println("Ошибка: собака не может быть безцветной");
    }
    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                name.equals(dog.name) &&
                color.equals(dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
