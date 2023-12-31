package livraria;

public class Livro {
    int id;
    String titulo;
    String anoPublicacao;
    String editora;
    int qtdPags;

    Livro(int id, String titulo, String anoPublicacao, String editora, int qtdPags){
        this.id = id;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.qtdPags = qtdPags;
    }

    String detalhar(){
        String detalhe = "";

        detalhe += "\nID: " + this.id;
        detalhe += "\nTítulo: " + this.titulo;
        detalhe += "\nAno: " + this.anoPublicacao;
        detalhe += "\nEditora: " + this.editora;
        detalhe += "\nQtd. Páginas: " + this.qtdPags;

        return detalhe;
    }

    String imprimir(){
        String ret="";
        ret = this.id + " - " + this.titulo + " - " + this.anoPublicacao;
        return ret;
    }
}
