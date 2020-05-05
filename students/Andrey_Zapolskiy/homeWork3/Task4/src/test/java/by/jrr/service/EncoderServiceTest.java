package by.jrr.service;

import by.jrr.bean.Encoder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncoderServiceTest {

    @Test
    void encoder() {
        String expectedResult = "40=>(";
        Encoder encoder = new Encoder((short)40, 'g');
        EncoderService encoderService = new EncoderService();

        String actualResult = encoderService.encoderMethod(encoder);
        assertEquals(actualResult, expectedResult, "Encoder Method : code to char");
    }

    @Test
    void decoder() {
        String expectedResult = "g=>103";
        Encoder encoder = new Encoder((short)40, 'g');
        EncoderService encoderService = new EncoderService();

        String actualResult = encoderService.decoderMethod(encoder);
        assertEquals(actualResult, expectedResult, "Decoder Method : char to code");
    }
}