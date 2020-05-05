package by.khilko.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car car;
    private Car carTwo;

    @BeforeEach
    void setUp() {
        car = new Car("Fiat", "Green", 160, 50);
        carTwo = new Car("Fiat", "Green", 160, 50);
    }

    @Test
    void getModel() {
        String message = "Return model of car";
        String expected = "Fiat";
        String actual = car.getModel();

        assertEquals(expected, actual, message);
    }

    @Test
    void setModel() {
        String message = "Set and return model of car";
        car.setModel("Audi");
        String expected = "Audi";
        String actual = car.getModel();

        assertEquals(expected, actual, message);
    }

    @Test
    void getColor() {
        String message = "Set and return color of car";
        String expected = "Green";
        String actual = car.getColor();

        assertEquals(expected, actual, message);
    }

    @Test
    void setColor() {
        String message = "Set and return model of car";
        car.setColor("Brown");
        String expected = "Brown";
        String actual = car.getColor();

        assertEquals(expected, actual, message);
    }

    @Test
    void getMaxSpeed() {
        String message = "Return maxSpeed of car";
        int expected = 160;
        int actual = car.getMaxSpeed();

        assertEquals(expected, actual, message);
    }

    @Test
    void setMaxSpeed() {
        String message = "Set and return maxSpeed of car";
        car.setMaxSpeed(200);
        int expected = 200;
        int actual = car.getMaxSpeed();

        assertEquals(expected, actual, message);
    }

    @Test
    void getCurrentSpeed() {
        String message = "Return current speed of car";
        int expected = 50;
        int actual = car.getCurrentSpeed();

        assertEquals(expected, actual, message);
    }

    @Test
    void setCurrentSpeed() {
        String message = "Set and return current speed of car";
        car.setCurrentSpeed(90);
        int expected = 90;
        int actual = car.getCurrentSpeed();

        assertEquals(expected, actual, message);
    }

    @Test
    void testEquals() {
        String message = "Return equals of objects car";
        boolean expected = true;
        boolean actual = car.equals(carTwo);

        assertEquals(expected, actual, message);
    }

    @Test
    void testHashCode() {
        String message = "Return hashcode of objects car";
        int expected = carTwo.hashCode();
        int actual = car.hashCode();

        assertEquals(expected, actual, message);
    }

    @Test
    void testToString() {
        String message = "Return toString method of object car";
        String expected = car.toString();
        String actual = carTwo.toString();

        assertEquals(expected, actual, message);
    }
}