package service;

import by.abs.bean.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class CarServiceTest {
    Car vwGolfGti;
    CarService carService;

    @BeforeEach
    void setUp() {
        vwGolfGti = new Car();
        carService = new CarService();
    }

    @Test
    public void accelerate() {
        String testMessage = "the car must accelerate";
        int[] expected = {150, 100, 200};
        int[] speedLimit = {150, 200, 200};
        int[] currentSpeed = {66, 77, 200};
        int[] topSpeed = {249, 100, 200};

        for (int i = 0; i < expected.length; i++){
           vwGolfGti.setCurrentSpeed(currentSpeed[i]);
            vwGolfGti.setTopSpeed(topSpeed[i]);
            carService.accelerate(speedLimit[i], vwGolfGti);
            int actual = vwGolfGti.getCurrentSpeed();
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void decelerate() {
        String testMessage = "the golf must decelerate";
        int[] expected = {100, 100, 0};
        int[] speedLimit = {100, 200, -1};
        int[] currentSpeed = {150, 100, 111};
        int[] topSpeed = {249, 100, 200};

        for (int i = 0; i < expected.length; i++){
            vwGolfGti.setCurrentSpeed(currentSpeed[i]);
            vwGolfGti.setTopSpeed(topSpeed[i]);
            carService.decelerate(speedLimit[i], vwGolfGti);
            int actual = vwGolfGti.getCurrentSpeed();
            assertEquals(expected[i], actual, testMessage);
        }
        }
    

    @Test
    void isParked() {
        String testMessage = "the golf is parked";
        boolean[] expected = {true, false};
        int[] currentSpeed = {0, 222};

        for (int i = 0; i < expected.length; i++){
            vwGolfGti.setCurrentSpeed(currentSpeed[i]);
            boolean actual = carService.isParked(vwGolfGti);
            assertEquals(expected[i], actual, testMessage);
        }
    }



    @Test
    void isDriving() {
        String testMessage = "cruising";
        boolean[] expected = {false, true};
        int[] currentSpeed = {0, 88};



        for (int i= 0; i < expected.length; i++) {
            vwGolfGti.setCurrentSpeed(currentSpeed[i]);
            boolean actual = carService.isDriving(vwGolfGti);
            assertEquals(expected[i], actual, testMessage);

        }
    }

    @Test
    void canAccelerate() {
        String testMessage = "the golf must accelerate";
        boolean[] expected = {true, false};
        int[] currentSpeed = {55, 249};
        int[] topSpeed = {249, 249};

        for (int i = 0; i < expected.length; i++){
            vwGolfGti.setCurrentSpeed(currentSpeed[i]);
            vwGolfGti.setTopSpeed(topSpeed[i]);
            boolean actual = carService.canAccelerate(vwGolfGti);
            assertEquals(expected[i], actual, testMessage);
    }
}}