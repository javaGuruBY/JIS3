package by.mmkle.service;

import by.mmkle.bean.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {
    Car car;
    CarService service;
    @BeforeEach
    public void setUp(){
        car = new Car();
        service = new CarService();
    }

    @Test
    void accelerate() {
        int[] expected = {100, 150, 200};
        int[] targetSpeed = {100, 200, 200};
        int[] currentSpeed = {50, 50, 200};
        int[] maxSpeed = {200, 150, 200};

        for (int i = 0; i < expected.length; i++){
            car.setCurrentSpeed(currentSpeed[i]);
            car.setMaxSpeed(maxSpeed[i]);
            service.accelerate(targetSpeed[i], car);
            int actual = car.getCurrentSpeed();
            assertEquals(expected[i], actual);
        }
    }
}