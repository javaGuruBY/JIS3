package by.jrr.car.service;
import by.jrr.car.bean.Car;

public class CarService {

    public void accelerate(Car car, int targetSpeed) {
        for (int i = car.getCurrentSpeed(); i <= car.getMaxSpeed(); i++) {
            if (i > targetSpeed) {
                break;
            } else if (i == targetSpeed || i == car.getMaxSpeed()) {
                car.setCurrentSpeed(i);
                break;
            } else car.setCurrentSpeed(i);
        }
    }

    public void decelerate(Car car, int targetSpeed) {
        for (int i = car.getCurrentSpeed(); i >= 0 ; i--) {
            if (car.getCurrentSpeed() < targetSpeed) {
                break;
            } else if (car.getCurrentSpeed() == targetSpeed || car.getCurrentSpeed() == 0) {
                break;
            }else car.setCurrentSpeed(i);
        }
    }

    public boolean isDriving(Car car) {
        return car.getCurrentSpeed() > 0;
    }

    public boolean isStopped(Car car) {
        return car.getCurrentSpeed() == 0;
    }

    boolean canAccelerate(Car car) {
        return car.getCurrentSpeed() < car.getMaxSpeed();
    }
}
