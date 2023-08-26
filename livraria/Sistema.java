package livraria;
import java.util.Scanner;

public class Sistema {
    
    public static void main(String[] args){
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        Livraria efraim = new Livraria();

        while(opcao != 4) {
            System.out.println("1. Listar livros");
            System.out.println("2. Adicionar livro");
            System.out.println("3. Detalhar livro");
            System.out.println("4. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); //lixo do buffer
            executarOpcao(opcao, scanner, efraim);
        }

        System.out.println("Sistema encerrado.");
        scanner.close();
    }

    public static void executarOpcao(int opcao, Scanner scanner, Livraria efraim){
        switch(opcao){
            case 1:
                System.out.println("Listando livros...");

                break;
            case 2:
                System.out.println("Adicionando livro...");
                System.out.print("\tID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); //forçar leitura do lixo
                System.out.print("\tTítulo: ");
                String titulo = scanner.nextLine();
                System.out.print("\tAno de publicação: ");
                String ano = scanner.nextLine();
                System.out.print("\tEditora: ");
                String editora = scanner.nextLine();
                System.out.print("\tQuantidade de páginas: ");
                int qtdPags = scanner.nextInt();

                Livro livro = new Livro(id, titulo, ano, editora, qtdPags);
                efraim.adicionarLivro(livro);
                break;
            case 3:
                System.out.println("Destalhando livro...");
                break;
        }
    }

}
