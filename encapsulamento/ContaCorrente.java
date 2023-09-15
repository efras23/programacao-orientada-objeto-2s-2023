package encapsulamento;

public class ContaCorrente{
    public Integer numero;
    public Double saldo;

    public ContaCorrente(Integer numero, Double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }

    public void transferir(ContaCorrente contaDestino, Double valor){

    }

    public void depositar(Double valor){

    }
}