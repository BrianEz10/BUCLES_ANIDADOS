package BUCLESANIDADOS;

public class BuclesAnidados1 {
    public static void main(String[] args) {
        System.out.println("Números perfectos entre 1 y 1000:");
            for (int num = 1; num <= 1000; num++) {
                int sumaDivisores = 0;

                for (int divisor = 1; divisor < num; divisor++) {
                    if (num % divisor == 0) {
                        sumaDivisores += divisor;
                    }
                }
                if (sumaDivisores == num) {
                    System.out.println(num);
                }
            }
        }
}
