package GenericsSetAndMap.set.comoSetTestaIgualdade;

/*
 * Como as coleções Hash testam igualdade?
 * Se hashCode e equals estiverem implementados:
 * - Primeiro hashCode. Se der igual, usa equals para confirmar.
 * - Lembre-se: String, Integer, Double, etc..já possuem equals e hashCode.
 *
 * Se hashCode e equals não estiverem implementados:
 * - Compara as referências (ponteiros) dos objetos.
 */

import GenericsSetAndMap.set.comoSetTestaIgualdade.entities.Product;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Product> set = new HashSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        Product product = new Product("Notebook", 1200.0);
        System.out.println(set.contains(product));
    }
}
