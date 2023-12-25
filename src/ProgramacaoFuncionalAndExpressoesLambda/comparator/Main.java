package ProgramacaoFuncionalAndExpressoesLambda.comparator;

/*
 * Suponha uma classe Product com os atributos name e price.
 * Podemos implementar a comparação de produtos por meio da implementação da interface Comparable<Product>.
 * Entretanto, desta forma nossa classe não fica fechada para alteração: se o critério de comparação mudar,
 * precisamos alterar a classe Product.
 * Podemos então usar o default method "sort" da interface List: default void sort(Comparator<? super E> c)
 */

import ProgramacaoFuncionalAndExpressoesLambda.comparator.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));


/*
        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };
*/

        // Lambda/Função anonima
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

//        list.sort(new MyComparator());

        for (Product product : list) {
            System.out.println(product);
        }
    }
}
