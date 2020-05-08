package by.abs.bean;


public class ShapeDemo {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Triangle( "triangle", 6.0, 7.0, 9.0);
        shapes[1] = new Square("square", 4, 9.0);
        shapes[2] = new Circle("circle",  6.0);

        for (Shape shape : shapes){
            System.out.println("the area of the " + shape.getName() + " is " + shape.getArea());
        }
    }
}
