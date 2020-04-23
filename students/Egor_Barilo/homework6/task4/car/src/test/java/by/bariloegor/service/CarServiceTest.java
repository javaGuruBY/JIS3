package by.bariloegor.service;

import by.bariloegor.bean.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarServiceTest {
    Car car;
    CarService carService;

    @Before
    public void setUp(){
        car = new Car("Ferrari", "Red", 400);
        carService = new CarService();
    }

    @Test
    public void isTargetSpeedMoreActualTest() {
        boolean[] expected = {true, false};
        car.setActualSpeed(250);
        int[] targetSpeed = {300, 50};
        for(int i = 0; i < expected.length; i++){
            boolean actual = carService.isTargetSpeedMoreActual(car, targetSpeed[i]);
            assertEquals("Should return is target speed less actual.", expected[i], actual);
        }
    }

    @Test
    public void accelerateTest() {
        int[] expected = {346, 100};
        int[] targetSpeed = {346, 50};
        for(int i = 0; i < expected.length; i++){
            car.setActualSpeed(100);
            carService.accelerate(car, targetSpeed[i]);
            int actual = car.getActualSpeed();
            assertEquals("Should accelerate speed to target.", expected[i], actual);
        }
    }

    @Test
    public void canAccelerateTest(){
        boolean[] expected = {true, false};
        int[] speed = {300, 500};
        for(int i = 0; i < expected.length; i++){
            car.setActualSpeed(speed[i]);
            boolean actual = carService.canAccelerate(car);
            assertEquals("Should return is actual speed less max.", expected[i], actual);
        }
    }

    @Test
    public void proceedAccelerateTest(){
        int[] expected = {350, 400};
        int[] targetSpeed = {350, 500};
        for(int i = 0; i < expected.length; i++){
            car.setActualSpeed(200);
            carService.proceedAccelerate(car, targetSpeed[i]);
            int actual = car.getActualSpeed();
            assertEquals("Should accelerate speed to target.", expected[i], actual);
        }
    }

    @Test
    public void decelerateTest(){
        int[] expected = {100, 200, 0};
        int[] targetSpeed = {100, 250, 0};
        for(int i = 0; i < expected.length; i++){
            car.setActualSpeed(200);
            carService.decelerate(car, targetSpeed[i]);
            int actual = car.getActualSpeed();
            assertEquals("Should decelerate speed.", expected[i], actual);
        }
    }

    @Test
    public void proceedDecelerateTest(){
        int[] expected = {100, 0, 200, 0};
        int[] targetSpeed = {100, 0, 300, -100};
        for(int i = 0; i < expected.length; i++){
            car.setActualSpeed(200);
            carService.decelerate(car, targetSpeed[i]);
            int actual = car.getActualSpeed();
            assertEquals("Should decelerate speed", expected[i], actual);
        }
    }

    @Test
    public void isTargetSpeedLessActualTest(){
        boolean[] expected = {true, false};
        int[] targetSpeed = {100, 400};
        for(int i = 0; i < expected.length; i++){
            car.setActualSpeed(250);
            boolean actual = carService.isTargetSpeedLessActual(car, targetSpeed[i]);
            assertEquals("Should return is target speed less actual.", expected[i], actual);
        }
    }

    @Test
    public void isStopperTest(){
        boolean[] expected = {true, false};
        int[] speed = {0, 10};
        for(int i = 0; i < expected.length; i++){
            car.setActualSpeed(speed[i]);
            boolean actual = carService.isStopped(car);
            assertEquals("Should return is car stopped.", expected[i], actual);
        }
    }
}