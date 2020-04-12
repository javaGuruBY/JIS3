package bean;


public class SignComparator {
    private int num = 10;

    public SignComparator(){
    }

    public SignComparator(int num){
        this.num = num;
    }

    public void setSignComparator(int num){
        this.num = num;
    }

    public int getSignComparator(){
        return num;
    }



    public String getSign(int a){
        if(a > 0){
            return "Number is positive";
        } else if(a < 0){
            return "Number is negative";
        } else {
            return "Number is equal to zero";
        }
    }



}
