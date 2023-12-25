package ProgramacaoFuncionalAndExpressoesLambda.predicate.v1;

/*
 * public interface Predicate<T> {
 *  boolean test(T t);
 * }
 *
 * Fazer um programa que, a partir de uma lista de produtos, remova da lista somente
 * aqueles cujo preço mínimo seja 100.
 *
 * Implementação da interface
 *
 */

import ProgramacaoFuncionalAndExpressoesLambda.predicate.v1.entities.Product;
import ProgramacaoFuncionalAndExpressoesLambda.predicate.v1.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        list.removeIf(new ProductPredicate());
        System.out.println(list);

        for (Product product : list) {
            System.out.println(product);
        }

    }
}
