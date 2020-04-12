package bean;

public class LightColorDetector {
    private int num = 425;

    public LightColorDetector(){
    }

    public LightColorDetector(int num){
        this.num = num;
    }

    public void setColor(int num){
        this.num = num;
    }

    public int getColor(){
        return num;
    }


}
