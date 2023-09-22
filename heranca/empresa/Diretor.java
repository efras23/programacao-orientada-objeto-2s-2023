package heranca.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Diretor {
    private String nome;
    private Integer cpf;
    private Integer telefone;
    private Integer quantidadeGerencias;


    public Diretor() {

    }

    public Diretor(String nome, Integer cpf, Integer telefone, Integer quantidadeGerenciados) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.quantidadeGerencias = quantidadeGerenciados;
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

    public Integer getQuantidadeGerencias() {
        return this.quantidadeGerencias;
    }

    public void setQuantidadeGerencias(Integer quantidadeGerencias) {
        this.quantidadeGerencias = quantidadeGerencias;
    }

    public BigDecimal getSalario(){
        return new BigDecimal(20000.00);
    }

    public BigDecimal getBonificacao(){
        return getSalario().multiply(new BigDecimal(0.40));
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", telefone='" + getTelefone() + "'" +
            ", quantidadeGerenciados='" + getQuantidadeGerencias() + "'" +
            ", salario='" + getSalario() + "'" +
            ", bonificacao='" + getBonificacao().setScale(2, RoundingMode.UP) + "'" +
            "}";
    }


}
