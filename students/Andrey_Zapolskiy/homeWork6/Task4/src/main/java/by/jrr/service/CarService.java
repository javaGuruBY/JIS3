package by.jrr.service;

import by.jrr.bean.Car;

public class CarService {
    public void accelerate(int targetSpeed, Car car) {
        for( int i = car.getCurrentSpeed(); i <= car.getMaxSpeed(); i++) {
            if(car.getCurrentSpeed()>targetSpeed) {
                break;
            } else if(targetSpeed == car.getCurrentSpeed() || targetSpeed == car.getMaxSpeed()) {
                break;
            }
            car.setCurrentSpeed((short)i);
        }

    }
    public void decelerate(int targetSpeed, Car car) {
        for( int i = car.getCurrentSpeed(); i >= targetSpeed; i--) {
            if(car.getCurrentSpeed() == targetSpeed) {
                break;
            } else if(targetSpeed > car.getCurrentSpeed()) {
                break;
            }
            car.setCurrentSpeed((short)i);
        }

    }
     public boolean isDriving(Car car) {
        return car.getCurrentSpeed() > 0;
    }
      public boolean isStopped(Car car) {
        return car.getCurrentSpeed() == 0;
    }
    public boolean canAccelerate(Car car) {
        return car.getCurrentSpeed() < car.getMaxSpeed();
    }
}





