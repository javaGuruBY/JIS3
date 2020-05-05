package service;








import by.abs.bean.Car;

public class CarService {


    public void accelerate(int speedLimit, Car vwGolfGti){
        while (vwGolfGti.getCurrentSpeed() < speedLimit && vwGolfGti.getCurrentSpeed() < vwGolfGti.getTopSpeed()){
            vwGolfGti.setCurrentSpeed(vwGolfGti.getCurrentSpeed() + 1);
        }
    }



    public void decelerate(int speedLimit, Car vwGolfGti) {
        while (vwGolfGti.getCurrentSpeed() > speedLimit && vwGolfGti.getCurrentSpeed() > 0) {
            vwGolfGti.setCurrentSpeed(vwGolfGti.getCurrentSpeed() - 1);
        }

    }

    public boolean isParked(Car vwGolfGti){
        return (vwGolfGti.getCurrentSpeed() == 0);

    }


    public boolean isDriving(Car vwGolfGti){
        return (vwGolfGti.getCurrentSpeed() > 0);

}


    public boolean canAccelerate(Car vwGolfGti){
        return (vwGolfGti.getCurrentSpeed() < vwGolfGti.getTopSpeed());

}

}







