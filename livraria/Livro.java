package livraria;

public class Livro {
    int id;
    String titulo;
    String anoPublicacao;
    String editora;
    int qtdPags;

    Livro(int id, String titulo, String anoPublicacao, String editora, int qtdPag){
        this.id = id;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.qtdPags = qtdPag;
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
}
