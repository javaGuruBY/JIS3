package by.jrr;

import by.jrr.bean.Encoder;
import by.jrr.service.EncoderService;

public class EncoderDemo {
        public static void main(String[] args) {
            Encoder encoder = new Encoder();
            EncoderService service = new EncoderService();

            service.encode(encoder);
            service.decode(encoder);

            service.encode((short)12);
            service.decode('P');
        }
    }
}
