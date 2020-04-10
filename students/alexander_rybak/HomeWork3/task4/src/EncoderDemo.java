import service.EncoderService;

public class EncoderDemo {
    public static void main(String[] args) {
        EncoderService encoder = new EncoderService();

        encoder.encode((short) 97);
        encoder.decode('a');
    }
}
