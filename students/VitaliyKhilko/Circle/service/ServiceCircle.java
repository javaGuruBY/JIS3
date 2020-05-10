package service;
import bean.Circle;

public class ServiceCircle {
    public void calculateArea(Circle circle){
        double SSS = Math.PI * ( circle.getRadius() * circle.getRadius());
        System.out.println(SSS);
    }
}
