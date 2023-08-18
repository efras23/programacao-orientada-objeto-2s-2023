package atividade1;

/**
 * verificaNumeroPrimo
 */
public class verificaNumeroPrimo {

    public static void main(String args[]) {
        verificarNumeroPrimo(7); /* digitar número primo */
    }

    public static void verificarNumeroPrimo(Integer n) {
        /* criar variável inteira */

        if (n < 2) {
            System.out.println("0");
        } else if (n == 2 || n == 3 || n == 5 || n == 7) {
            System.out.println("1");
        } else {
            /* falta implementar */
        }
    }
}