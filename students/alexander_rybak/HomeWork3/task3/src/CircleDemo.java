import bean.Circle;
import service.CircleService;


public class CircleDemo {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(5);
        Circle secondCircle = new Circle(3);

        CircleService circleService = new CircleService();

        System.out.println("Area of the first circle with radius = " + firstCircle.getRadius() + " is " + circleService.calculateArea(firstCircle));
        System.out.println("Area of the second circle with radius = " + secondCircle.getRadius() + " is " + circleService.calculateArea(secondCircle));

        firstCircle.setRadius(8);
        secondCircle.setRadius(15);

        System.out.println("Area of these two circles:");

        System.out.println("Area of the first circle with radius = " + firstCircle.getRadius() + " is " + circleService.calculateArea(firstCircle));
        System.out.println("Area of the second circle with radius = " + secondCircle.getRadius() + " is " + circleService.calculateArea(secondCircle));
    }
}
