package ApiDeCollectionsAndGenerics.listJava;

import java.util.LinkedList;

public class LinkedListCollections {
    public static void main(String[] args) {

        /*
        Igual o array list porem com melhor performance para os metodos add e remove
        */

        LinkedList<Integer> minhaLinkedList = new LinkedList<>();

        for(int i = 10; i <= 20; i++){
            minhaLinkedList.add(i);
            System.out.println(i);
        }

        System.out.println(minhaLinkedList);

        // remove o primeiro elemento
        System.out.println(minhaLinkedList.pop());

        // retorna o primeiro elemento
        System.out.println(minhaLinkedList.peek());

        // remove o primeiro elemento
        System.out.println(minhaLinkedList.poll());

        // remove o ultimo elemento
        System.out.println(minhaLinkedList.pollLast());


        System.out.println(minhaLinkedList);

    }
}
