package by.jrr;

import by.jrr.bean.TV;
import by.jrr.service.TVService;

public class App {
    public static void main(String[] args) {
        TV tv = new TV(4);
        TVService tvService = new TVService();
        tvService.nextChannel(tv);
    }
}
