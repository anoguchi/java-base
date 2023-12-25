package ProgramacaoFuncionalAndExpressoesLambda.consumer.v2;

/*
 * Com método estático
 */

import ProgramacaoFuncionalAndExpressoesLambda.consumer.v2.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 350.00));
        productList.add(new Product("HD", 150.00));

        productList.forEach(Product::staticPriceUpdate);

        productList.forEach(System.out::println);

    }
}
