package by.khilko.service;


import by.khilko.bean.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {
    Logger log = LoggerFactory.getLogger(CarService.class);

    public void increaseCarSpeed(Car car, int setSpeed) {
        if(isCarStopped(car) || isCarDriving(car)){
            while(isTargetSpeedUp(car,setSpeed) && car.getCurrentSpeed() != car.getMaxSpeed() ){
                car.setCurrentSpeed(car.getCurrentSpeed() + 1);
            }
        }
    }

    public void slowDownCarSpeed(Car car, int setSpeed){
        if(isCarDriving(car)){
            while(isTargetSpeedDown(car,setSpeed) && isCarDriving(car) ){
                car.setCurrentSpeed(car.getCurrentSpeed() - 1);
            }
        }
    }

    private boolean isTargetSpeedUp(Car car, int speed){
        return car.getCurrentSpeed() < speed;
    }

    private boolean isTargetSpeedDown(Car car, int speed){
        return car.getCurrentSpeed() > speed;
    }

    private boolean isCarStopped(Car car){
        return car.getCurrentSpeed() == 0;
    }

    private boolean isCarDriving(Car car){
        return car.getCurrentSpeed() > 0;
    }
}
