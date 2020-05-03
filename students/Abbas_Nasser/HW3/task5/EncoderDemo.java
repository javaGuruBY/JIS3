import bean.Encoder;
import service.EncoderService;

public class EncoderDemo {

    public static void main(String[] args) {

        Encoder encoder = new Encoder();
       EncoderService service = new EncoderService();

        service.encode(encoder);
        service.decode(encoder);

        service.encode((short)99);
        service.decode('Y');
    }
}
