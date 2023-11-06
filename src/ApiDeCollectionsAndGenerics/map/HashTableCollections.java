package ApiDeCollectionsAndGenerics.map;

import java.util.Hashtable;

public class HashTableCollections {
    public static void main(String[] args) {

        /*
         * Chave - valor
         * Não permite valores nulos
         * Não permite valores duplicados
         */

        Hashtable<String, Double> notas = new Hashtable<String, Double>();
        notas.put("Lógica de Programação", 7.8);
        notas.put("OOP", 8.8);
        notas.put("Algoritmos", 7.0);
        notas.put("Banco de dados", 7.2);

        System.out.println(notas);
        System.out.println(notas.values());
        System.out.println(notas.get("Banco de dados"));
        System.out.println(notas.getOrDefault("Estrutura de dados", 0.0));
        System.out.println(notas.put("Java", 7.9));
        System.out.println(notas);
        System.out.println(notas.containsKey("Java"));
        System.out.println(notas.containsValue(6.0));
        System.out.println(notas.replace("Java", 10.0));
        System.out.println(notas.putIfAbsent("HTML", 9.8));
        System.out.println(notas);

    }
}
