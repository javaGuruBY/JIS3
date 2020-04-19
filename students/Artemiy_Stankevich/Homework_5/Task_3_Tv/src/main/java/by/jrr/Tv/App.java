package by.jrr.Tv;

import by.jrr.Tv.bean.Tv;
import by.jrr.Tv.service.TvService;

public class App {
    public static void main(String[] args) throws Exception {
        Tv sony = new Tv();
        sony.setManufacturer("Sony");
        TvService tvService = new TvService();
        tvService.turnOnTv(sony);
        tvService.turnOnNextChannel(sony);
        for (int i = 0; i < 10; i++) {
            tvService.increaseSound(sony);
        }
        System.out.println("Manfacturer Tv: " + sony.getManufacturer() + ", currents channel is " + sony.getCurrentChannel() +
                ", current volume: " + sony.getCurrentVolume());
    }
}
