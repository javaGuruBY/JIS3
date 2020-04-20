package by.mmkle.service;

import by.mmkle.bean.Car;

public class CarService {
    public void accelerate(int targetSpeed, Car car){
        while (car.getCurrentSpeed() < targetSpeed && car.getCurrentSpeed() < car.getMaxSpeed()){
            car.setCurrentSpeed(car.getCurrentSpeed() + 1);
        }
    }

    public void decelerate(int targetSpeed, Car car){
        while (car.getCurrentSpeed() > targetSpeed && car.getCurrentSpeed() > 0){
            car.setCurrentSpeed(car.getCurrentSpeed() - 1);
        }
    }

    public boolean isDriving(Car car){
        return (car.getCurrentSpeed() > 0);
    }

    public boolean isStopped(Car car){
        return (car.getCurrentSpeed() == 0);
    }

    public boolean canAccelerate(Car car){
        return (car.getCurrentSpeed() < car.getMaxSpeed());
    }
}
