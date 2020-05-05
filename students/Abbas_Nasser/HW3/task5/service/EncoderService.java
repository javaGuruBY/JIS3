package service;

import bean.Encoder;

public class EncoderService {

        public void decode(Encoder encoder){
            System.out.println("'" + encoder.getCharacter() + "' => " + (int)encoder.getCharacter());
        }

        public void encode(Encoder encoder){
            System.out.println(encoder.getCode() + " => '" + (char)encoder.getCode() + "'");
        }

        public void decode(char symbol){
            System.out.println("'" + symbol + "' => " + (int)symbol);
        }

        public void encode(short code){
            System.out.println(code + " => '" + (char)code + "'");
        }

    }

