package by.bariloegor;

import by.bariloegor.service.EncoderService;

public class EncoderDemo {
    public static void main(String[] args) {
        EncoderService encoderService = new EncoderService();
        encoderService.encode((short)98);
        encoderService.decode('h');
    }
}
