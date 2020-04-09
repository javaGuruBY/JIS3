package by.bariloegor.service;

public class EncoderService {
    public void encode(short code){
        System.out.println(code + " in symbol is " + (char)code + ".");
    }

    public void decode(char symbol){
        System.out.println("'" + symbol + "' in code is " + (int)symbol);
    }
}
