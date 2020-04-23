package by.bariloegor.service;

import by.bariloegor.bean.Car;

public class CarService {
    public boolean isTargetSpeedMoreActual(Car car,int targetSpeed){
        return targetSpeed > car.getActualSpeed();
    }

    public void proceedAccelerate(Car car, int targetSpeed){
        while(isTargetSpeedMoreActual(car, targetSpeed)){
            if(canAccelerate(car)) {
                car.setActualSpeed(car.getActualSpeed() + 1);
            } else break;
        }
    }

    public void accelerate(Car car, int targetSpeed){
        if(isTargetSpeedMoreActual(car, targetSpeed)){
            proceedAccelerate(car, targetSpeed);
        }
    }

    public void decelerate(Car car, int targetSpeed){
        if (isTargetSpeedLessActual(car, targetSpeed)) {
            proceedDecelerate(car, targetSpeed);
        }
    }

    public void proceedDecelerate(Car car, int targetSpeed){
        while(isTargetSpeedLessActual(car, targetSpeed)){
            if(!isStopped(car)){
                car.setActualSpeed(car.getActualSpeed() - 1);
            } else break;
        }
    }

    public boolean isTargetSpeedLessActual(Car car, int targetSpeed) {
        return targetSpeed < car.getActualSpeed();
    }

    public boolean isStopped(Car car){
        return car.getActualSpeed() == 0;
    }

    public boolean canAccelerate(Car car){
        return car.getActualSpeed() < car.getMaxSpeed();
    }

}
