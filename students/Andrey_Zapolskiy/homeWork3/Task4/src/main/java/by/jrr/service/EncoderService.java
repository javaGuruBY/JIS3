package by.jrr.service;

import by.jrr.bean.Encoder;

public class EncoderService {

    public String encoderMethod(Encoder encoder){
        return encoder.getCode()+"=>"+(char)encoder.getCode();
    }
    public String decoderMethod(Encoder encoder){
        return encoder.getSymbol()+"=>"+(short)encoder.getSymbol();
    }
}
