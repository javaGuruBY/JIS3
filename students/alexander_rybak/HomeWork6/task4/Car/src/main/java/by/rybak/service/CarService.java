package by.rybak.service;

import by.rybak.bean.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
    private static Logger logger = LoggerFactory.getLogger(CarService.class);

    public void accelerate(Car car, int targetSpeed) {
        if (car.getCurrentSpeed() < targetSpeed && canAccelerate(car)) {
            while (car.getCurrentSpeed() < targetSpeed && canAccelerate(car)) {
                car.setCurrentSpeed((car.getCurrentSpeed()) + 1);
            }
        } else {
            logger.warn("impossible to increase speed!");
        }
    }

    public void decelerate(Car car, int targetSpeed) {
        if (car.getCurrentSpeed() > targetSpeed) {
            while (car.getCurrentSpeed() > targetSpeed) {
                car.setCurrentSpeed((car.getCurrentSpeed()) - 1);
            }
        } else {
            logger.warn("impossible to increase speed!");
        }
    }

    public boolean isDriving(Car car) {
        if (car.getCurrentSpeed() > 0) return true;
        return false;
    }

    public boolean isStopped(Car car) {
        if (car.getCurrentSpeed() == 0) return true;
        return false;
    }

    public boolean canAccelerate(Car car) {
        if (car.getCurrentSpeed() < car.getMaxSpeed()) return true;
        return false;
    }
}
