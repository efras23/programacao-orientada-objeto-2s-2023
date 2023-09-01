package atividade3;

public class Produto {
    String nome;
    int qtd;

    Produto(String nomeProduto, int qtd){
        this.nome = nomeProduto;
        this.qtd = qtd;
    }

    public int compNomeProduto(String nomeProduto){
        int igual = 0;

        if (nomeProduto == this.nome){
            igual = 1;
        }

        return igual;
    }

    public void mudarQuantidade(int qtd){
        this.qtd = qtd;
    }
}
