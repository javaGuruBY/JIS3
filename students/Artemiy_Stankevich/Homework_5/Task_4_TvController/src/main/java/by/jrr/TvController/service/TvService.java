package by.jrr.TvController.service;
import by.jrr.TvController.bean.Tv;

public interface TvService {

    void turnOnNextChannel(Tv tv) throws Exception;
    void turnOnPreviousChannel(Tv tv) throws Exception;
    void increaseSound(Tv tv) throws Exception;
    void decreaseSound(Tv tv) throws Exception;
    void turnOnTv(Tv tv);
    void turnOffTv(Tv tv);
}
