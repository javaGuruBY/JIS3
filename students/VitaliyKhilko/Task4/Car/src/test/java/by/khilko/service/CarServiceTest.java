package by.khilko.service;

import by.khilko.bean.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {
    private CarService service;
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("Reno","Black",160, 80);
        service = new CarService();
    }

    @Test
    void testIncreaseCarSpeed() {
        String message = "Should accelerate speed of car";
        int[] expected = {120,160};
        int[] speed ={120, 170};
        for(int i = 0; i < expected.length; i++){
            service.increaseCarSpeed(car,speed[i]);
            int actual = car.getCurrentSpeed();
            assertEquals(expected[i], actual, message);
        }

    }

    @Test
    void testSlowDownCarSpeed() {
        String message = "Should slow down speed of car";
        int[] expected = {80,10};
        int[] speed ={120, 10};
        for(int i = 0; i < expected.length; i++){
            service.slowDownCarSpeed(car,speed[i]);
            int actual = car.getCurrentSpeed();
            assertEquals(expected[i], actual, message);
        }
    }
}