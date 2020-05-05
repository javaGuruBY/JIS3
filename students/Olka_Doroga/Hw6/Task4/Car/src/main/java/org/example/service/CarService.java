package org.example.service;

import org.example.bean.Car;

public class CarService {
    public void accelerate(int targetSpeed, Car car) {
        for (double i = car.getCurrentSpeed(); i <= car.getMaxSpeed(); i++) {
            if (car.getCurrentSpeed() == targetSpeed ||
            car.getCurrentSpeed() == car.getMaxSpeed()) {
                break;
            }
            if (car.getCurrentSpeed() > targetSpeed) {
                break;
            }
            car.setCurrentSpeed(i);
        }
    }

    public void decelerate(int targetSpeed, Car car) {
        for (double i = car.getCurrentSpeed(); i >= 0; i --) {
            if (car.getCurrentSpeed() == targetSpeed ||
            car.getCurrentSpeed() == 0) {
                break;
            }
            if (car.getCurrentSpeed() < targetSpeed) {
                break;
            }
            car.setCurrentSpeed(i);
        }
    }

    public boolean isDriving(Car car) {
        return (car.getCurrentSpeed() > 0);
    }

    public boolean isStopped(Car car) {
        return (car.getCurrentSpeed() == 0);
    }

    public boolean canAccelerate(Car car) {
        return (car.getCurrentSpeed() < car.getMaxSpeed());
    }
}
