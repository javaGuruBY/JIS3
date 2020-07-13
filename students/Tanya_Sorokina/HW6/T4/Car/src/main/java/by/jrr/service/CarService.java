package by.jrr.service;
import by.jrr.bean.Car;

public class CarService {
    Car car = new Car();

    public void accelerate(Car car, int targetSpeed){
        if (isStopped(car) == true || canAccelerate(car) == true) {
            for (int i = car.getCurrentSpeed(); i <= car.getMaxSpeed(); i++) {
                if (i> targetSpeed){
                    break;
                }else if (i == targetSpeed || i == car.getMaxSpeed()){
                    car.setCurrentSpeed(i);
                    break;
                }else car.setCurrentSpeed(i);
            }
        }
    }

    public void decelerate (Car car, int targetSpeed){
        if (isDriving(car) == true || isStopped(car) == false){
            for (int i = car.getCurrentSpeed(); i >=targetSpeed; i--){
                if(car.getCurrentSpeed() < targetSpeed){
                   car.setCurrentSpeed(i);
                    break;
                } else if( car.getCurrentSpeed() == 0){
                    car.setCurrentSpeed(i);
                    break;
                }else car.setCurrentSpeed(i);
            }
        }
    }

    public boolean isDriving(Car car){
        if (car.getCurrentSpeed() > 0) {
            return true;
        } else return false;
    }

    public boolean isStopped(Car car){
        if (car.getCurrentSpeed() == 0) {
            return true;
        } else return false;



    }

    public boolean canAccelerate(Car car){
        if (car.getCurrentSpeed() < car.getMaxSpeed()){
            return true;
        } else return false;
    }


}
