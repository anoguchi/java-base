package ProgramacaoFuncionalAndExpressoesLambda.predicate.v4;

/*
 * Expressão lambda decladara.
 */

import ProgramacaoFuncionalAndExpressoesLambda.predicate.v4.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));

        double min = 100.00;
        Predicate<Product> productPredicate = product -> product.getProductPrice() >= min;
        list.removeIf(productPredicate);
        
        System.out.println(list);

        for (Product product : list) {
            System.out.println(product);
        }

    }
}
