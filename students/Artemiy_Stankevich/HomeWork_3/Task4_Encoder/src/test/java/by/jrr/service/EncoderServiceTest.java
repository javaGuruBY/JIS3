package by.jrr.service;

import by.jrr.bean.Encoder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncoderServiceTest {
    Encoder encoder;
    EncoderService encoderService;
    @BeforeEach
    public void initEach () {
         encoder = new Encoder();
         encoderService = new EncoderService();
    }

    @Test
    void encodeTest() {
        String expected = "88 => X";
        String actual = encoderService.encode((short) 88);
        assertEquals(expected, actual, "[ERROR]encodeTest should return 88 => X");
    }

    @Test
    void decodeTest() {
        String expected = "A => 65";
        String actual = encoderService.decode('A');
        assertEquals(expected, actual, "decodeTest should return A => 65");
    }
}