package ProgramacaoFuncionalAndExpressoesLambda.function;

/*
 * public interface Function<T, R> {
 *  R apply(T t);
 * }
 *
 * Fazer um programa que, a partir de uma lista de produtos, gere uma nova lista contendo os nome dos
 * produtos em caixa alta.
 */

import ProgramacaoFuncionalAndExpressoesLambda.function.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 350.00));
        productList.add(new Product("HD Case", 80.00));

        Function<Product, String> productStringFunction = product -> product.getProductName().toUpperCase();

        List<String> names = productList.stream().map(productStringFunction).toList();

        // direto
        // List<String> names = productList.stream().map(product -> product.getProductName().toUpperCase()).toList();
        names.forEach(System.out::println);



    }
}
