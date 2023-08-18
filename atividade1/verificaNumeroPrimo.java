package atividade1;


public class verificaNumeroPrimo {

    public static void main(String args[]) {
        System.out.println(verificarNumeroPrimo(13));
    }

    /* verificaNumeroPrimo */
    public static int verificarNumeroPrimo(Integer n) {
        int num_dividers = 2;
        int is_prime = 0;

        if (n >= 2) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    num_dividers++;
                }
            }
            if (num_dividers <= 2) {
                is_prime = 1;
            }
        }

        return is_prime;
    }
}