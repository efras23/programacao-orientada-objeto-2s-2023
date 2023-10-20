package collections;
import java.util.Vector;

public class ExemploVector {
    
    public static void main(String args[]){

        Vector<String> frutas = new Vector<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        System.out.println(frutas.get(0));

        if(frutas.contains("Banana")){
            System.out.println("Banana está no vetor.");
        }

        frutas.remove("Banana");

        if(!frutas.contains("Banana")){
            System.out.println("Banana NÃO está no vector.");
        }

        frutas.clear();

        if(frutas.isEmpty()){
            System.out.println("O Vector está vazio.");
        }
    }

}
