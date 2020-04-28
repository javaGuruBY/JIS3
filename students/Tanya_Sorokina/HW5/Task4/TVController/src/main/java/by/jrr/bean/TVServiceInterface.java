package by.jrr.bean;

public interface TVServiceInterface {
    public void switchToTheNextChannel(TV tv) throws Exception;
    public void switchToTheLastChannel(TV tv) throws Exception;
    public void  increaseTheVolume(TV tv) throws Exception;
    public void decreaseTheVolume(TV tv) throws Exception;
}
