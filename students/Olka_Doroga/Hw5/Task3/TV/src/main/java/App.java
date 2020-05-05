import org.example.bean.TV;
import org.example.service.TVService;

public class App {
    public static void main(String[] args) {
        TV tv = new TV();
        TVService tvService = new TVService();
        tv.setManufacturer("LG");
        System.out.println(tv);

        tvService.nextChannel(tv);
        tvService.volumeDown(tv);
        tvService.tvOff(tv);
        System.out.println(tv);
    }

}
