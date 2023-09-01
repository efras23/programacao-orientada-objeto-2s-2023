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

            executarOpcao(opcao, estoque, scanner);
        } while(opcao != 5);

        System.out.println("\tSistema encerrado.\n");
        scanner.close();
    }

    public static void executarOpcao(int opcao, Estoque estoque, Scanner scanner){
        String nomeProduto = "";
        int qtd = 0;
        Produto produto;
        
        switch(opcao){
            case 1:
                System.out.println("\n\tListando produtos...\n");
                
                System.out.println(estoque.listarProdutos()); //listar produtos
                break;
            case 2:
                System.out.println("\n\tAtualizando produtos...\n");
                System.out.print("\tNome: ");
                nomeProduto = scanner.nextLine();
                
                if(estoque.procurarProduto(nomeProduto) == 1) {
                    System.out.print("\tNova quantidade: ");
                    qtd = scanner.nextInt();

                    estoque.atualizarProduto(nomeProduto,qtd); //atualizar produto
                    System.out.println("\tQuantidade atualizada com sucesso!\n");
                } else {
                    System.out.println("\n\tProduto não encontrado!\n");
                }
                break;
            case 3:
                System.out.println("\n\tAdicionando produtos...\n");
                System.out.print("\tNome: ");
                nomeProduto = scanner.nextLine();
                System.out.print("\tQuantidade: ");
                qtd = scanner.nextInt();
                scanner.nextLine();

                produto = new Produto(nomeProduto,qtd);
                estoque.addProduto(produto); //adicionar produto
                break;
            case 4:
                System.out.println("\n\tRemovendo produtos...\n");
                System.out.print("\tNome: ");
                nomeProduto = scanner.nextLine();
                if(estoque.procurarProduto(nomeProduto) == 1){
                    System.out.println("\n\tAinda não sei como fazer isso ;)\n");
                    //estoque.removerProduto(nomeProduto); //remover produto
                    //System.out.println("\n\tProduto removido!\n");
                } else {
                    System.out.println("\n\tProduto não encontrado.\n");
                }
                break;
            
            default:
                break;
        }
    }
}