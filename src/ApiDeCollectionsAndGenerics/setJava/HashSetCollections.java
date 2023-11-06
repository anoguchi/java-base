package ApiDeCollectionsAndGenerics.setJava;

import java.util.HashSet;

public class HashSetCollections {
    public static void main(String[] args) {

        /*
         * Coleção de itens onde cada item é unico
         * Implementa a interface SET
         * Objetos são inseridos com base em seu código hash
         * Elemenos null tbm são permitidos
         */

        HashSet<String> linguagens = new HashSet<>();
        linguagens.add("Java");
        linguagens.add("Python");
        linguagens.add("Javascript");
        linguagens.add("C#");
        linguagens.add("Kotlin");
        linguagens.add("Rust");
        linguagens.add("C");

        System.out.println(linguagens);
        System.out.println(linguagens.contains("C"));
        System.out.println(linguagens.contains("Swift"));

        for(String i: linguagens){
            System.out.println(i);
        }
    }
}
