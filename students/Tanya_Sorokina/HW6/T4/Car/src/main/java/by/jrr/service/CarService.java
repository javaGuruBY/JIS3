package by.jrr.service;
import by.jrr.bean.Car;

//Методы
//        1) Ускориться: void accelerate(int targetSpeed) - должен увеличивать скорость автомобиля
//        используя цикл. В каждой итерации скорость нужно увеличивать на 1 ед. до достижения
//        заданной скорости или максимально допустимой скорости автомобиля. Если текущая скорость
//        автомобиля больше заданной, то автомобиль ускоряться не должен.
//
//        2) Замедлиться: void decelerate(int targetSpeed) - должен уменьшать скорость автомобиля
//        используя цикл. В каждой итерации скорость нужно уменьшать на 1 ед. до достижения заданной
//        скорости или полной остановки автомобиля. Если текущая скорость меньше заданной,
//        то автомобиль замедляться не должен.
//
//        3) Находится ли автомобиль в движении: boolean isDriving() - возвращает true если
//        скорость автомобиля больше 0.
//
//        4) Стоит ли автомобиль на месте: boolean isStopped() - возвращает true если скорость
//        автомобиля равна 0.
//
//        5) Есть ли возможность ускориться: boolean canAccelerate() - возвращает true если
//        текущая скорость меньше максимальной.

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
