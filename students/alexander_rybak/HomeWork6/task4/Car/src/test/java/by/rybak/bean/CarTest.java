package by.rybak.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    public void setUp(){
        car = new Car("Audi", "black", 240);
        car.setCurrentSpeed(60);
    }

    @Test
    void getModel() {
        String expected = "Audi";
        String actual = car.getModel();

        assertEquals(expected, actual);
    }

    @Test
    void setModel() {
        String expected = "BMV";
        car.setModel("BMV");
        String actual = car.getModel();

        assertEquals(expected, actual);
    }

    @Test
    void getColor() {
        String expected = "black";
        String actual = car.getColor();

        assertEquals(expected, actual);
    }

    @Test
    void setColor() {
        String expected = "red";
        car.setColor("red");
        String actual = car.getColor();

        assertEquals(expected, actual);
    }

    @Test
    void getMaxSpeed() {
        int expected = 240;
        int actual = car.getMaxSpeed();

        assertEquals(expected, actual);
    }

    @Test
    void setMaxSpeed() {
        int expected = 200;
        car.setMaxSpeed(200);
        int actual = car.getMaxSpeed();

        assertEquals(expected, actual);
    }

    @Test
    void getCurrentSpeed() {
        int expected = 60;
        int actual = car.getCurrentSpeed();

        assertEquals(expected, actual);
    }

    @Test
    void setCurrentSpeed() {
        int expected = 80;
        car.setCurrentSpeed(80);
        int actual = car.getCurrentSpeed();

        assertEquals(expected, actual);
    }

    @Test
    void testEquals() {
        Car car1 = new Car("Audi", "black", 240);
        car1.setCurrentSpeed(60);
        boolean actual = car.equals(car1);
        assertTrue(actual);

        Car car2 = new Car();
        boolean actual2 = car.equals(2);
        assertFalse(actual2);

        boolean actual3 = car.equals(car);
        assertTrue(actual3);
    }

    @Test
    void testToString() {
        String expected = "Car{model='Audi', color='black', maxSpeed=240, currentSpeed=60}";
        String actual = car.toString();
        assertEquals(expected, actual, "Should return right strings");
    }
}