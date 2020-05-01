package by.jrr.service;

import by.jrr.bean.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    Car car;
    CarService carService;

//    @BeforeEach
//    public init (){
//        car = new Car();
//        carService = new CarService();
//
//    }

    @Test
    void canAccelerateTest() {
        car = new Car();
        carService = new CarService();
        car.setCurrentSpeed(50);
        car.setMaxSpeed(120);
        boolean expected = true;
        boolean actual = carService.canAccelerate(car);
        assertEquals(expected, actual, "Error");
        System.out.println(" canAccelerateTest has passed");
    }


    @Test
    void isStoppedTest() {
        car = new Car();
        carService = new CarService();
        car.setCurrentSpeed(0);
        boolean expected = true;
        boolean actual = carService.isStopped(car);
        assertEquals(expected, actual, "Error");
        System.out.println(" isStoppedTest has passed");
    }

    @Test
    void isDrivingTest() {
        car = new Car();
        carService = new CarService();
        car.setCurrentSpeed(50);
        boolean expected = true;
        boolean actual = carService.isDriving(car);
        assertEquals(expected, actual, "Error");
        System.out.println(" isDrivingTest has passed");
    }

    @Test
    void accelerateTest() {
        car = new Car();
        carService = new CarService();
        car.setCurrentSpeed(10);
        car.setMaxSpeed(100);
        carService.accelerate(car, 120);
        int expected = 100;
        int actual = car.getCurrentSpeed();
        assertEquals(expected, actual, "Error");
        System.out.println("accelerateTest has passed");
    }

    @Test
    void decelerateTest(){
        car = new Car();
        carService = new CarService();
        car.setCurrentSpeed(130);
        carService.decelerate(car, 60);
        int expected = 60;
        int actual = car.getCurrentSpeed();
        assertEquals(expected, actual, "Error");
        System.out.println("accelerateTest has passed");
    }
}