package livraria;
import java.util.ArrayList;

public class Livraria {
    ArrayList<Livro> livros;

    Livraria(){
        this.livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }

    public String listarLivros(){
        String listaLivros = "";

        for(Livro livro : this.livros){
            listaLivros = livro.imprimir() + "\n";
        }

        return listaLivros;
    }

    public String buscarLivroPorId(int idBusca){
        String ret = "Livro não encontrado.";

        for(Livro livro : this.livros){
            if(livro.id == idBusca){
                ret = livro.imprimir();
            }
        }

        return ret;
    }    
}