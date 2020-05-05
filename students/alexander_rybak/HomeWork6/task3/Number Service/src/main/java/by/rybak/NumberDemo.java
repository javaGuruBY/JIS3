package by.rybak;

import by.rybak.bean.Number;
import by.rybak.service.NumberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NumberDemo {
    private static Logger logger = LoggerFactory.getLogger(NumberDemo.class);

    public static void main(String[] args) {
        Number number = new Number(6,0);
        NumberService service = new NumberService();

        logger.info(String.valueOf(service.rangeEvenCount(number)));
        System.out.println(number);
    }
}
