package encapsulamento;

import java.math.BigDecimal;

public class ContaCorrente{
    public Integer numeroConta;
    public BigDecimal saldo;

    public ContaCorrente(){
        setSaldo(new BigDecimal("0.00"));
    }

    public ContaCorrente(Integer numero){
        setSaldo(new BigDecimal("0.00"));
    }

    public ContaCorrente(Integer numero, BigDecimal saldo){
        setSaldo(new BigDecimal("0.00"));
        this.numeroConta = numero;
        this.saldo = saldo;
    }

    //métodos

    public BigDecimal getSaldo(){
        return this.saldo;
    }

    private void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }

    public void transferirSaldo(ContaCorrente contaDestino, BigDecimal valorTransferencia){
        if(getSaldo().compareTo(valorTransferencia) >= 0){
            setSaldo(getSaldo().subtract(valorTransferencia));
            contaDestino.setSaldo(getSaldo().add(valorTransferencia));
        }
    }

    public void depositar(BigDecimal valorDeposito){
        if(valorDeposito.compareTo(new BigDecimal("0")) == 1){
            setSaldo(getSaldo().add(valorDeposito));
        }
    }

    public static void depositar(ContaCorrente contaDeposito, BigDecimal valorDeposito){
        if(valorDeposito.compareTo(new BigDecimal("0")) == 1){
            contaDeposito.setSaldo(contaDeposito.getSaldo().add(valorDeposito));
        }
    }
}