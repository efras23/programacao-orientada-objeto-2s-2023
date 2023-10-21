package collections;

import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {

        LinkedList<Integer> inteiros = new LinkedList<>();

        inteiros.add(10);
        inteiros.add(20);
        inteiros.add(30);

        System.out.println(inteiros.get(1));

        inteiros.add(1, 15);
        System.out.println(inteiros.get(1));
        System.out.println(inteiros.get(2));
        
    }
}
