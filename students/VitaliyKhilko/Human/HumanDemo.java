import bean.Human;
import service.ServiceHuman;

public class HumanDemo {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------------------------");
        Human man1 = new Human("Vasya",22);
        ServiceHuman service = new ServiceHuman();
        service.greet(man1);
        System.out.println("------------------------------------------------------------------------------");
        Human man2 = new Human("Olga",45);
        ServiceHuman service2 = new ServiceHuman();
        service2.greet(man2);
        System.out.println("------------------------------------------------------------------------------");
        Human man3 = new Human("Natasha",13);
        ServiceHuman service3 = new ServiceHuman();
        service3.greet(man3);
        System.out.println("------------------------------------------------------------------------------");
    }
}
