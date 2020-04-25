package by.jrr.car;

import by.jrr.car.bean.Car;
import by.jrr.car.service.CarService;

public class App {
    public static void main(String[] args) {
        Car car = new Car("Audi RS 7 Sportback", "black", 300);
        car.setCurrentSpeed(150);
        CarService carService = new CarService();
        carService.accelerate(car,297);
        System.out.println("carService.isDriving(car) = " + carService.isDriving(car));
        System.out.println("car.getCurrentSpeed() = " + car.getCurrentSpeed());
        carService.decelerate(car,0);
        System.out.println("car.getCurrentSpeed() = " + car.getCurrentSpeed());
        System.out.println("carService.isStopped(car) = " + carService.isStopped(car));
    }
}
