package org.example.service;

import org.example.bean.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    @Test
    void accelerate() {
        Car car = new Car();
        CarService carService = new CarService();
        double expected = 90;
        car.setMaxSpeed(150);
        carService.accelerate(90, car);
        double actual = car.getCurrentSpeed();
        assertEquals(expected, actual, "getCurrentSpeed");
    }

    @Test
    void decelerate() {
        Car car = new Car();
        CarService carService = new CarService();
        double expected = 10;
        car.setCurrentSpeed(15);
        carService.decelerate(10, car);
        double actual = car.getCurrentSpeed();
        assertEquals(expected, actual, "getCurrentSpeed");
    }

    @Test
    void isDriving() {
        Car car = new Car();
        CarService carService = new CarService();
        boolean expected = true;
        car.setCurrentSpeed(50);
        boolean actual = carService.isDriving(car);
        assertEquals(expected, actual, "isDriving");
    }

    @Test
    void isStopped() {
        Car car = new Car();
        CarService carService = new CarService();
        boolean expected = true;
        car.setCurrentSpeed(0);
        boolean actual = carService.isStopped(car);
        assertEquals(expected, actual, "isStopped");
    }

    @Test
    void canAccelerate() {
        Car car = new Car();
        CarService carService = new CarService();
        boolean expected = true;
        car.setCurrentSpeed(70);
        car.setMaxSpeed(150);
        boolean actual = carService.canAccelerate(car);
        assertEquals(expected, actual, "canAccelerate");
    }
}