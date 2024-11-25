package BUCLESANIDADOS;

public class BuclesAnidados4 {
    public static void main(String[] args) {
        String letras = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

        // Bucle que genera y muestra las subcadenas
        for (int i = 0; i < letras.length(); i++) {
            System.out.println(letras.substring(i));
        }
    }
}

