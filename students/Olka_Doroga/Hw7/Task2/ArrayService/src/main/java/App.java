import org.example.service.ArrayService;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ArrayService service = new ArrayService();
        int[] arrayNew = new int[4];
        service.fillRandomly(arrayNew);
        System.out.println("Arrays.toString(arrayNew) = " + Arrays.toString(arrayNew));
        service.printArray(arrayNew);


    }
}
