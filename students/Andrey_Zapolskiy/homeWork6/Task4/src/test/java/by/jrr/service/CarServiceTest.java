package by.jrr.service;

import by.jrr.bean.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {

    @Test
    void accelerate() {
        int[] expected = {50, 80};
        int[] targetSpeed = {50, 81};
        Car[] car = {
                new Car(100,1),
                new Car(80,0)
        };
        CarService carService = new CarService();
        for(int i = 0; i < car.length; i++) {
            carService.accelerate(targetSpeed[i], car[i]);
            int actual = car[i].getCurrentSpeed();

            assertEquals(expected[i], actual, "Car is stopped");
        }
    }

    @Test
    void decelerate() {
        int[] expected = {50, 20};
        int[] targetSpeed = {50, 50};
        Car[] car = {
                new Car(100,80),
                new Car(80,20)
        };
        CarService carService = new CarService();
        for(int i = 0; i < car.length; i++) {
            carService.decelerate(targetSpeed[i], car[i]);
            int actual = car[i].getCurrentSpeed();

            assertEquals(expected[i], actual, "Car is stopped");
        }
    }

    @Test
    void isDriving() {
        boolean[] expected = {true, false};
        Car[] car = {
                new Car(100,1),
                new Car(80,0)
        };
        CarService carService = new CarService();
        for(int i = 0; i < car.length; i++) {
            boolean actual = carService.isDriving(car[i]);

            assertEquals(expected[i], actual, "Car is stopped");
        }
    }

    @Test
    void isStopped() {
        boolean[] expected = {true, false};
        Car[] car = {
                new Car(100,0),
                new Car(80,100)
        };
        CarService carService = new CarService();
        for(int i = 0; i < car.length; i++) {
            boolean actual = carService.isStopped(car[i]);

            assertEquals(expected[i], actual, "Car is stopped");
        }
    }

    @Test
    void canAccelerate() {
        boolean[] expected = {true, false};
        Car[] car = {
                new Car(100,80),
                new Car(80,100)
        };
        CarService carService = new CarService();
        for(int i = 0; i < car.length; i++) {
            boolean actual = carService.canAccelerate(car[i]);

            assertEquals(expected[i], actual, "Can car accelerate");
        }
    }
}