package by.mmkle.bean;

public class Parrot extends Bird {
    public Parrot(String name, int age, int flySpeed) {
        super(name, age, flySpeed);
    }

    @Override
    public String voice() {
        return "parrot says kesha";
    }
}
