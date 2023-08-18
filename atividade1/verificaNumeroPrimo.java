package atividade1;

/**
 * verificaNumeroPrimo
 */
public class verificaNumeroPrimo {

    public static void main(String args[]) {
        verificarNumeroPrimo(179); /* digitar número primo */
    }

    public static void verificarNumeroPrimo(Integer n) {
        /* criar variável inteira */

        if (n < 2) {
            System.out.println("0");
        } else {
            int qtdDivisores = 2;
            for (int i = 2; i < n/2; i++) {
                if (n % i == 0) {
                    qtdDivisores++;
                }
            }
            if (qtdDivisores <= 2) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}