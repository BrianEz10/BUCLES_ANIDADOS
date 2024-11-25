package BUCLESANIDADOS;
import java.util.Scanner;

public class BuclesAnidados6 {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce un número entero N: ");
            int N = scanner.nextInt();

            System.out.println("Números primos desde 2 hasta " + N + ":");

            for (int i = 2; i <= N; i++) {
                if (esPrimo(i)) {
                    System.out.println(i);
                }
            }

            scanner.close();
        }

        public static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
