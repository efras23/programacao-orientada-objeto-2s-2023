/*Sistema de Gerenciamento de Estoque*/
package atividade3;
import java.util.Scanner;

public class Sistema{
    public static void main(String[] agrs){
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();
    }
}