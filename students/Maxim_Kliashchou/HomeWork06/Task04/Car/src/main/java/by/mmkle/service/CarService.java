package by.mmkle.service;

import by.mmkle.bean.Car;

public class CarService {
    public void accelerate(int targetSpeed, Car car){
        while (car.getCurrentSpeed() < targetSpeed && car.getCurrentSpeed() < car.getMaxSpeed()){
            car.setCurrentSpeed(car.getCurrentSpeed() + 1);
        }
    }
}
