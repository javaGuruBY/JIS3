package by.jrr;


import by.jrr.bean.Counter;
import org.pmw.tinylog.Logger;

public class App {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Logger.info("counter.getValue(); \n" +
                "        counter.getStep();  \n" +
                "        counter.increment();\n" +
                "        counter.getValue(); \n" +
                "        counter.setStep(5);\n" +
                "        counter.increment();\n" +
                "        counter.setStep(2);\n" +
                "        counter.decrement();\n" +
                "        counter.getValue(); \n" +
                "        counter.getStep();");
        counter.getValue(); //Equals to 0
        counter.getStep();  //Equals to 1
        counter.increment();
        counter.getValue(); //Equals to 1
        counter.setStep(5);
        counter.increment();
        counter.setStep(2);
        counter.decrement();
        counter.getValue();  //Equals to 4
        counter.getStep();
        Logger.info("get final value of counter", counter.getValue());
        Logger.info(counter.getValue());

    }

}
