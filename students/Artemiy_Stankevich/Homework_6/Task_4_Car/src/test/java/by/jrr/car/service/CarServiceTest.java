package by.jrr.car.service;

import by.jrr.car.bean.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {
    Car car = new Car("BMW", "black", 320);
    CarService carService = new CarService();

    @Test
    void accelerateTest() {
        car.setCurrentSpeed(8);
        int expected = 300;
        carService.accelerate(car, 300);
        int actual = car.getCurrentSpeed();
        assertEquals(expected, actual, "car not accelerate");
    }

    @Test
    void decelerateTest() {
        car.setCurrentSpeed(100);
        int expected = 50;
        carService.decelerate(car,50);
        int actual = car.getCurrentSpeed();
        assertEquals(expected, actual, "car not accelerate");
    }

    @Test
    void isDrivingTest() {
        car.setCurrentSpeed(10);
        boolean expected = true;
        boolean actual = carService.isDriving(car);
        assertEquals(expected, actual, "Speed car equals 0");
    }

    @Test
    void isStoppedTest() {
        car.setCurrentSpeed(0);
        boolean expected = true;
        boolean actual = carService.isStopped(car);
        assertEquals(expected, actual, "[ERROR]");
    }

    @Test
    void canAccelerateTest() {
        car.setCurrentSpeed(100);
        boolean expected = true;
        boolean actual = carService.canAccelerate(car);
        assertEquals(expected, actual, "[ERROR]");
    }
}