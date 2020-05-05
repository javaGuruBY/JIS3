package by.rybak.bean;

import by.rybak.interfaces.Shape;

public abstract class AbstractShape implements Shape {
    protected String name;

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getArea(){
        return 0;
    }
    
    public double getPerimeter(){
        return 0;
    }
    
}
