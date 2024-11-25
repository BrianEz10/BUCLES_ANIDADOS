package BUCLESANIDADOS;

public class BuclesAnidados5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 99999; i++) {
            String numero = String.format("%05d", i);

            String numeroConE = numero.replace('3', 'E');

            System.out.println(numeroConE);
        }
    }
}
