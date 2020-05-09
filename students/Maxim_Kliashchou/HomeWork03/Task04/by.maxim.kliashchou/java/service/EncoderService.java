package service;

public class EncoderService {
    public void encode(int code){
        System.out.println(code + " => '" + (char)code + "'");
    }

    public void decode(char symbol){
        System.out.println("'" + symbol + "' => " + (int)symbol);
    }
}
