package encapsulamento;

public class Executavel{
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();

        c1.numero = 1;
        c1.saldo = 10;

        System.out.println(c1);
    }
}