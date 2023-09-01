package atividade3;
import java.util.ArrayList;

public class Estoque {
    ArrayList<Produto> produtos;

    Estoque(){
        this.produtos = new ArrayList<Produto>();
    }

    public String listarProdutos(){
        String listaProdutos = "";

        for(Produto produto : this.produtos){
            listaProdutos += produto.nome + " - " + produto.qtd + " un.\n";
        }

        return listaProdutos;
    }

    public void addProdutos(String nomeProduto, int qtd){
        produtos.add(new )
    }
}