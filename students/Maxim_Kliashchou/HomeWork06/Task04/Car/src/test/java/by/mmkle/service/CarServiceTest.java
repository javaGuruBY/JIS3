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
        String testMessage = "Should accelerate car";
        int[] expected = {100, 150, 200};
        int[] targetSpeed = {100, 200, 200};
        int[] currentSpeed = {50, 50, 200};
        int[] maxSpeed = {200, 150, 200};

        for (int i = 0; i < expected.length; i++){
            car.setCurrentSpeed(currentSpeed[i]);
            car.setMaxSpeed(maxSpeed[i]);
            service.accelerate(targetSpeed[i], car);
            int actual = car.getCurrentSpeed();
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void decelerate() {
        String testMessage = "Should decelerate car";
        int[] expected = {100, 0, 200};
        int[] targetSpeed = {100, -1, 300};
        int[] currentSpeed = {150, 50, 200};
        int[] maxSpeed = {200, 150, 200};

        for (int i = 0; i < expected.length; i++){
            car.setCurrentSpeed(currentSpeed[i]);
            car.setMaxSpeed(maxSpeed[i]);
            service.decelerate(targetSpeed[i], car);
            int actual = car.getCurrentSpeed();
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void isDriving() {
        String testMessage = "Is car driving";
        boolean[] expected = {true, false};
        int[] currentSpeed = {150, 0};

        for (int i = 0; i < expected.length; i++){
            car.setCurrentSpeed(currentSpeed[i]);
            boolean actual = service.isDriving(car);
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void isStopped() {
        String testMessage = "Car is stopped";
        boolean[] expected = {false, true};
        int[] currentSpeed = {150, 0};

        for (int i = 0; i < expected.length; i++){
            car.setCurrentSpeed(currentSpeed[i]);
            boolean actual = service.isStopped(car);
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void canAccelerate() {
        String testMessage = "Can car accelerate";
        boolean[] expected = {true, false};

        int[] currentSpeed = {150, 200};
        int[] maxSpeed = {200, 200};

        for (int i = 0; i < expected.length; i++){
            car.setCurrentSpeed(currentSpeed[i]);
            car.setMaxSpeed(maxSpeed[i]);
            boolean actual = service.canAccelerate(car);
            assertEquals(expected[i], actual, testMessage);
        }
    }
}