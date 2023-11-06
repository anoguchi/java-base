package ApiDeCollectionsAndGenerics.map;

import java.util.HashMap;

public class HashMapCollections {
    public static void main(String[] args) {

        /*
         * Armazena chave - valor
         * Chave -> indice
         * Objeto -> valor
         * Permite chaves nulas
         * Não garante a ordem
         */

        HashMap<String, Double> notas = new HashMap<String, Double>();
        notas.put("Lógica de Programação", 7.8);
        notas.put("OOP", 8.8);
        notas.put("Algoritmos", 7.0);
        notas.put("Banco de dados", 7.2);

        System.out.println(notas);
        System.out.println(notas.get("Banco de dados"));
        System.out.println(notas.getOrDefault("Estrutura de dados", 0.0));
        System.out.println(notas.put("Java", 7.9));
        System.out.println(notas);
        System.out.println(notas.containsKey("Java"));
        System.out.println(notas.containsValue(6.0));

    }
}
