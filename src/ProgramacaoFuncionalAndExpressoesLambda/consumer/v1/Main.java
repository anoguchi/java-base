package ProgramacaoFuncionalAndExpressoesLambda.consumer.v1;

/*
 * public interface Consumer<T> {
 *  void accept(T t);
 * }
 *
 * Fazer um programa que, a partir de uma lista de produtos, aumente o preço dos produtos em 10%.
 */

import ProgramacaoFuncionalAndExpressoesLambda.consumer.v1.entities.Product;
import ProgramacaoFuncionalAndExpressoesLambda.consumer.v1.util.PriceUpdate;

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

        productList.forEach(new PriceUpdate());

        productList.forEach(System.out::println);

    }
}
