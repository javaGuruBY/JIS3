import by.jrr.arrayService.service.ArrayService;

public class App {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] arrayTest = arrayService.create(20);
        arrayService.fillRandomly(arrayTest);
        arrayService.printArray(arrayTest);
        System.out.println();
        System.out.println("Sum all index in array is equals to " + arrayService.sum(arrayTest));
        System.out.println("Avg value all index in array is equals to  " + arrayService.avg(arrayTest));

    }
}
