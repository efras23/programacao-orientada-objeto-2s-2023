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

    public int procurarProduto(String nomeProduto){
        int produtoEncontrado = 0;

        for(Produto produto : this.produtos){
            if(produto.compNomeProduto(nomeProduto) == 1){
                produtoEncontrado = 1;
                System.out.println("\n" + produtoEncontrado + "\n");
            }
        }

        return produtoEncontrado;
    }

    public void atualizarProduto(String nomeProduto, int qtd){
        for (Produto produto : this.produtos){
            if(produto.compNomeProduto(nomeProduto) == 1){
                produto.mudarQuantidade(qtd);
            }
        }
    }

    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }

    public void removerProduto(String nomeProduto){
        for(Produto produto : this.produtos){
            if(nomeProduto == produto.nome){
                /*
                 ...
                 */
            }
        }
    }
}