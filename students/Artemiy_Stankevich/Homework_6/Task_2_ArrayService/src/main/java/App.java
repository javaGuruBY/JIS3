import by.jrr.arrayService.service.ArrayService;

public class App {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] arrayTest = arrayService.create(10);
        arrayService.fillRandomly(arrayTest);
        arrayService.printArray(arrayTest);
        System.out.println();
        System.out.println("Sum all index in array is equals to : " + arrayService.sum(arrayTest));
        System.out.println("Avg value array is equals to : " + arrayService.avg(arrayTest));
    }
}
