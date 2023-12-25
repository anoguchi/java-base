package ProgramacaoFuncionalAndExpressoesLambda.predicate.v2;

/*
 * Reference method com método estático.
 */

import ProgramacaoFuncionalAndExpressoesLambda.predicate.v2.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        // Método reference
        list.removeIf(Product::staticProductPredicate);

        System.out.println(list);

        for (Product product : list) {
            System.out.println(product);
        }

    }
}
