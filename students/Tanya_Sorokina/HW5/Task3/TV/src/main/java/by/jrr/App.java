package by.jrr;

import by.jrr.bean.TV;
import by.jrr.service.TvService;

import java.io.PrintStream;

public class App {
    public static void main(String[] args) throws Exception {
        TV tv = new TV(1, 3, "Samsung", true);
        TvService tvService = new TvService();
        tvService.decreaseTheVolume(tv);
        tvService.switchToTheNextChannel(tv);
        tvService.swichOnTV(tv);
        System.out.println("TV Manufacturer - " + tv.getManufacturer()
                + ", current Channel - " + tv.getCurrentChannel()
                + ", current Volume - " + tv.getCurrentVolume()
                + ", TV Swich status - " + tv.isTVSwichOn());
    }
}
