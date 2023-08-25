package atividade2;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double resultado = 0.0;
        
        System.out.print("CALCULADORA SIMPLES\n\n");
        System.out.print("\tDigite dois números: \n\n");
        System.out.print("\t\t1º: ");
        double num1 = scanner.nextDouble();
        System.out.print("\t\t2º: ");
        double num2 = scanner.nextDouble();

        System.out.print("Operação (+ - * /): ");
        char operacao = scanner.next().charAt(0); //O que é isso???

        switch(operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação INVÁLIDA");
                System.exit(1);
        }

        //RESULTADO
        System.out.println("\n\tResultado = " + resultado + "\n");
        
        scanner.close(); //???
    }
}