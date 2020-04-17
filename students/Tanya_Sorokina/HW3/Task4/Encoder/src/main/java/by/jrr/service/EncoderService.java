package by.jrr.service;
import by.jrr.bean.Encoder;

public class EncoderService {
        Encoder encoder = new Encoder();

    public String encode(short EncoderNumber){
        encoder.setNumberForEncode(EncoderNumber);
        return encoder.getNumberForEncode() + " => " + (char)encoder.getNumberForEncode();
    }

    public String decode(char DecoderChar){
        encoder.setCharForDecode(DecoderChar);
        return encoder.getCharForDecode() + " => " + (int)encoder.getCharForDecode();
    }
}
