import bean.Circle;
import service.CircleService;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.6);

        CircleService circleService = new CircleService();

        System.out.println("Area of circle = " + circleService.calculateArea(circle));

        circle.setRadius(10.1);
        System.out.println("Area of circle with radius = " + circleService.calculateArea(circle));
    }
}