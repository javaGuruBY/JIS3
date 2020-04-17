package by.jrr;
import by.jrr.service.EncoderService;

public class App {

    public static void main(String[] args) {
        EncoderService encoderService = new EncoderService();
        System.out.println(encoderService.encode((short)88));
        System.out.println(encoderService.decode('A'));
    }
}
