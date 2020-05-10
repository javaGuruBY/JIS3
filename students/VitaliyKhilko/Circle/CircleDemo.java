import bean.Circle;
import service.ServiceCircle;

public class CircleDemo {
    public static void main(String[] args) {
        Circle findAreaCircle = new Circle(43);
        ServiceCircle circle = new ServiceCircle();
        circle.calculateArea(findAreaCircle);
    }
}
