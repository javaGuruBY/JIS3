package by.abs.bean;

public abstract class AbstractShape implements Shape {
    protected String name;


    public AbstractShape() {
    }

    public AbstractShape(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
