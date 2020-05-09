public class App {
    public static void main(String[] args) {
        System.out.println("Builder pattern demo");

        Director director = new Director();
        Builder vwGolGti = new Car("vw Golf Gti");
        Builder suzukiMotorcycle = new Motorcycle("suzuki gsxr1100");

    director.construct(vwGolGti);
    Product p1 = vwGolGti.getVehicle();
    p1.showProduct();


    director.construct(suzukiMotorcycle);
    Product p2 = suzukiMotorcycle.getVehicle();
    p2.showProduct();


    }





}
