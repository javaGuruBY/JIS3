package bean;

public class Circle {
    final double PI = 3.1415;
    public double radius;


    public Circle(double radius){
        this.radius = radius;
    }

     public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void calculateArea(int radius){
        double SSS = PI * this.radius;
        System.out.println(SSS);
    }
}
