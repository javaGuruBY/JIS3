package by.jrr;

import by.jrr.bean.Car;
import by.jrr.service.CarService;

public class App {
    public static void main(String[] args) {
        Car car = new Car("Citroen C5", "grey", 180);
        CarService carService = new CarService();
        car.setCurrentSpeed(150);
        carService.decelerate(car, 50);
        carService.accelerate(car, 80);
        System.out.println("car Current Speed = " + car.getCurrentSpeed());
        System.out.println("Car is driving? = " + carService.isDriving(car));
        System.out.println("Car is stopped? = " + carService.isStopped(car));
        System.out.println("Car can accelerate? = " + carService.canAccelerate(car));
        carService.accelerate(car, 200);
        System.out.println("car Current Speed =" + car.getCurrentSpeed());
        System.out.println("Car can accelerate? = " + carService.canAccelerate(car));

    }


}
