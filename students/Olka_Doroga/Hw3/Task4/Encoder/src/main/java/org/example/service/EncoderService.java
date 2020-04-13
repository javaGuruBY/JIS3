package org.example.service;

import org.example.bean.Encoder;

public class EncoderService {

    public void decode(Encoder encoder){
        System.out.println("'" + encoder.getSymbol() + "' => " + (int)encoder.getSymbol());
    }

    public void encode(Encoder encoder){
        System.out.println(encoder.getCode() + " => '" + (char)encoder.getCode() + "'");
    }
}