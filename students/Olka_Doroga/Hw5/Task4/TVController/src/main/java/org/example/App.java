package org.example;

import org.example.bean.TV;
import org.example.bean.TVController;
import org.example.service.TVControllerService;

public class App {
    public static void main(String[] args) {
        TVControllerService tvControllerService = new TVControllerService();
        TVController tvController = new TVController();
        TV tv = new TV();
        tvControllerService.connectToTv(tvController);
        tvControllerService.nextChannel(tv, tvController);
        System.out.println(tv);
        tvControllerService.volumeDown(tv, tvController);
        System.out.println(tv);
        tvControllerService.tvOff(tv, tvController);
        System.out.println(tv);
        tvControllerService.nextChannel(tv, tvController);
        System.out.println(tv);
    }
}
