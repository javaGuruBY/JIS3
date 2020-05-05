package by.jrr.service;

import by.jrr.bean.Encoder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncoderServiceTest {


    @Test
    void encode() {
        Encoder encoder = new Encoder();
        EncoderService encoderServise = new EncoderService();
        String expected = "88 => X";
        String actual = encoderServise.encode((short)88);
        assertEquals(expected, actual, "[Error]");
    }

    @Test
    void decode() {
        Encoder encoder = new Encoder();
        EncoderService encoderServise = new EncoderService();
        String expected = "A => 65";
        String actual = encoderServise.decode('A');
        assertEquals(expected, actual, "[Error]");
    }
}