package by.khilko;


import by.khilko.bean.Car;
import by.khilko.service.CarService;

public class App {
    public static void main(String[] args) {

        Car car = new Car("Audi","Black",220,100);
        CarService service = new CarService();
        service.increaseCarSpeed(car,165);
        service.slowDownCarSpeed(car,25);
        service.increaseCarSpeed(car,75);
        service.slowDownCarSpeed(car,0);


    }
}

