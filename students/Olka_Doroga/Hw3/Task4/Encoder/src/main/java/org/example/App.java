package org.example;

import org.example.bean.Encoder;
import org.example.service.EncoderService;

public class App {
    public static void main(String[] args) {
        Encoder encoder = new Encoder((short)105,'f');
        EncoderService encoderService = new EncoderService();
        encoderService.encode(encoder);
        encoderService.decode(encoder);

    }
}
