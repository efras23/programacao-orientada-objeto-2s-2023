package heranca.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Gerente {
    private String nome;
    private Integer cpf;
    private Integer telefone;
    private Integer quantidadeGerenciados;


    public Gerente() {

    }

    public Gerente(String nome, Integer cpf, Integer telefone, Integer quantidadeGerenciados) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.quantidadeGerenciados = quantidadeGerenciados;
    }


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return this.cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getTelefone() {
        return this.telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Integer getQuantidadeGerenciados() {
        return this.quantidadeGerenciados;
    }

    public void setQuantidadeGerenciados(Integer quantidadeGerenciados) {
        this.quantidadeGerenciados = quantidadeGerenciados;
    }

    public BigDecimal getSalario(){
        return new BigDecimal(15000.00);
    }

    public BigDecimal getBonificacao(){
        return getSalario().multiply(new BigDecimal(0.25));
    }



    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", quantidadeGerenciados='" + getQuantidadeGerenciados() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificacao='" + getBonificacao().setScale(2, RoundingMode.UP) + "'" +
            "}";
    }


}
