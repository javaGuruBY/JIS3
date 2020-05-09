import service.EncoderService;

public class EncoderDemo {
    public static void main(String[] args) {
        EncoderService encoderService = new EncoderService();


        encoderService.encode((int) 65);
        encoderService.decode('X');
    }
}
