package atividade2;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double degreeCelsius, degreeFahrenheit;

        System.out.print("CONVERSOR: CELSIUS <-> FAHRENHEIT\n\n");
        System.out.print("\t\t1.   Celsius  -> Fahrenheit\n");
        System.out.print("\t\t2. Fahrenheit -> Celsius\n\n");

        //LEITURA
        System.out.print("Opção (1 ou 2): ");
        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                System.out.print("\t\t° Celsius: ");
                degreeCelsius = scanner.nextDouble();
                //CÁLCULO
                degreeFahrenheit = degreeCelsius * (9.0 / 5.0) + 32;

                System.out.print("\t\t° Fahrenheit = " + degreeFahrenheit);
                break;
            case 2:
                System.out.print("\t\t° Fahrenheit: ");
                degreeFahrenheit = scanner.nextDouble();

                degreeCelsius = (degreeFahrenheit - 32) / (9.0 / 5.0);
                System.out.print("\t\t° Celsius = " + degreeCelsius);
                break;
            default:
                System.out.print("\n\t\tOpção INVÁLIDA!\n");
                System.exit(1);
        }

        scanner.close();
    }
}
