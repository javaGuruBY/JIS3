package by.bariloegor;

import by.bariloegor.bean.Car;
import by.bariloegor.service.CarService;

public class App {
    public static void main(String[] args) {
        Car firstCar = new Car("Ferrari", "Red", 500);
        CarService carService = new CarService();
        carService.accelerate(firstCar, 400);
        carService.decelerate(firstCar, 200);
    }
}
