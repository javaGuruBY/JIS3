package by.rybak.service;

import by.rybak.bean.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {
    Car car;
    CarService service;

    @BeforeEach
    public void setUp(){
        car = new Car("Audi", "red", 240);
        service = new CarService();
        car.setCurrentSpeed(60);
    }

    @Test
    void accelerate() {
        int expected = 80;
        service.accelerate(car,80);
        int actual = car.getCurrentSpeed();
        assertEquals(expected, actual);

        int expected1 = 80;
        service.accelerate(car,70);
        int actual1 = car.getCurrentSpeed();
        assertEquals(expected1, actual1);
    }

    @Test
    void decelerate() {
        int expected = 40;
        service.decelerate(car,40);
        int actual = car.getCurrentSpeed();
        assertEquals(expected, actual);

        int expected1 = 40;
        service.decelerate(car,50);
        int actual1 = car.getCurrentSpeed();
        assertEquals(expected1, actual1);
    }

    @Test
    void isDriving() {
        boolean actual = service.isDriving(car);
        assertTrue(actual);

        car.setCurrentSpeed(0);
        boolean actual1 = service.isDriving(car);
        assertFalse(actual1);
    }

    @Test
    void isStopped() {
        car.setCurrentSpeed(0);
        boolean actual = service.isStopped(car);
        assertTrue(actual);

        car.setCurrentSpeed(240);
        boolean actual1 = service.isStopped(car);
        assertFalse(actual1);
    }

    @Test
    void canAccelerate() {
        boolean actual = service.canAccelerate(car);
        assertTrue(actual);

        car.setCurrentSpeed(240);
        boolean actual1 = service.canAccelerate(car);
        assertFalse(actual1);
    }
}