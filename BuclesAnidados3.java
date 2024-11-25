package BUCLESANIDADOS;

import java.util.Scanner;

public class BuclesAnidados3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero N: ");
        int N = scanner.nextInt();

        long sumaFactoriales = 0;

        for (int i = 0; i <= N; i++) {
            sumaFactoriales += calcularFactorial(i);
        }

        System.out.println("La suma de los factoriales desde 0 hasta " + N + " es: " + sumaFactoriales);

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
