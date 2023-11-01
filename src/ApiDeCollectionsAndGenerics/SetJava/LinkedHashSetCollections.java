package ApiDeCollectionsAndGenerics.SetJava;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetCollections {
    public static void main(String[] args) {

        /*
         * Implementação de HashTable e lista vinculada da interface set
         * Herda da hashet e implementa a set
         * Elementos devem ser únicos
         * Mantém a ordem de inserção
         */

        LinkedHashSet<String> linguagens = new LinkedHashSet<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Javascript");
        linguagens.add("C#");
        linguagens.add("Kotlin");
        linguagens.add("Rust");
        linguagens.add("C");

        linguagens.remove("Javascript");
        System.out.println(linguagens);
        System.out.println(linguagens.contains("C"));
        System.out.println(linguagens.contains("Swift"));

        for(String i: linguagens){
            System.out.println(i);
        }

    }

}
