import bean.Encoder;
import service.ServiceEncoder;

public class EncoderDemo {
    public static void main(String[] args) {
        Encoder encoder = new Encoder();
        ServiceEncoder service = new ServiceEncoder();

        service.encode(encoder);
        service.decode(encoder);

        service.encode((short)23);
        service.decode('P');
    }
}
