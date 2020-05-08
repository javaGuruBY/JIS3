
import bean.Circle;
import service.CircleService;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(8.5);

        CircleService circleService = new CircleService();

        System.out.println("the circle's area = " + circleService.calculateArea(circle));

        circle.setRadius(16);
        System.out.println("the circle's area with radius = " + circleService.calculateArea(circle));
    }
}