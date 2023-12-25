package ProgramacaoFuncionalAndExpressoesLambda.predicate.v3;

/*
 * Reference method com método não estático.
 */

import ProgramacaoFuncionalAndExpressoesLambda.predicate.v3.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("HD Case", 80.90));


        list.removeIf(Product::nonStaticProductPredicate);
        
        System.out.println(list);

        for (Product product : list) {
            System.out.println(product);
        }

    }
}
