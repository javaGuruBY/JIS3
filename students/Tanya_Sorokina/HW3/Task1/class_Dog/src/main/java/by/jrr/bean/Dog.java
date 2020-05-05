package by.jrr.bean;

public class Dog implements java.io.Serializable{

    private String name;
    private int age;
    private String color;

    public Dog(){
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void voice() {
        System.out.println("WooF-Woof");
    }

    public void eat(){
        System.out.println("Ham-Hamam");
    }

    public void sleep() {
        System.out.println("Z-z-haarrrr-z");
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
}
