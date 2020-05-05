package by.jrr;

public class App {
    public static void main(String[] args) {
                int sum = 0;
                int count = 0;
                for (int i = 1; i <= 500; i++){
                    if (i == 17 || i == 71) {
                        continue;
                    }
                    if (isPrimeNumber(i)){
                        sum += i;
                        count++;
                    }
                    if (count == 50){
                        break;
                    }
                }
        System.out.println("sum = " + sum);
        System.out.println("count = " + count);

    }

            public static boolean isPrimeNumber(int number) {
                if (number == 1) return false;
                for (int i = 2; i <= Math.sqrt(number); i++){
                    if (number % i == 0){
                        return false;
                    }
                }
                return true;
            }

    }


