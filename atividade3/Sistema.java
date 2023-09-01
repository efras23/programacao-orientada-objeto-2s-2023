/*Sistema de Gerenciamento de Estoque*/
package atividade3;
import java.util.Scanner;

public class Sistema{
    public static void main(String[] agrs){
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        do{
            System.out.println("GERENCIAMENTO DE ESTOQUE\n");

            System.out.println("1. Listar Produtos");
            System.out.println("2. Atualizar");
            System.out.println("3. Adicionar");
            System.out.println("4. Remover");
            System.out.println();
            System.out.println("5. SAIR\n");
    
            System.out.print("Digite a opção: ");
            opcao = scanner.nextInt(); //leitura
            scanner.nextLine();
            System.out.print(opcao);

        } while(opcao != 5);

        System.out.println("\tSistema encerrado.\n");
        scanner.close();
    }

    public void executarAcao(int opcao, Estoque estoque, Scanner scanner){
        switch(opcao){
            case 1:
                System.out.println("\n\tListando livros...");
                listarProdutos();
                break;
            case 2:
                atualizarProdutos();
                break;
            case 3:
                System.out.println("\n\tAdicionando produtos...\n");
                System.out.print("\tNome: ");
                String nomeProduto = scanner.nextLine();
                System.out.print("\tQuantidade: ");
                int qtd = scanner.nextInt();
                scanner.nextLine();
                estoque.addProdutos(nomeProduto,qtd);
                break;
            case 4:
                remProdutos();
                break;
        }
    }
}