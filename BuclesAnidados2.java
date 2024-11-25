package BUCLESANIDADOS;

import java.util.Scanner;

public class BuclesAnidados2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero N: ");
        int N = scanner.nextInt();

        System.out.println("Factoriales desde 0 hasta " + N + ":");
        for (int i = 0; i <= N; i++) {
            System.out.println(i + "! = " + calcularFactorial(i));
        }

        scanner.close();
    }

    public static long calcularFactorial(int numero) {
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
