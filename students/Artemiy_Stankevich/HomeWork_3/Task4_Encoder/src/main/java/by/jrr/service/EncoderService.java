package by.jrr.service;

import by.jrr.bean.Encoder;

public class EncoderService {
    Encoder encoder = new Encoder();

    public String encode(short encoderNum) {
        encoder.setNumForEncode(encoderNum);
        return encoder.getNumForEncode() + " => " + (char)encoder.getNumForEncode();
    }
    public String decode(char decoderChar) {
        encoder.setCharForDecode(decoderChar);
        return encoder.getCharForDecode() + " => " + (int) encoder.getCharForDecode();
    }
}
