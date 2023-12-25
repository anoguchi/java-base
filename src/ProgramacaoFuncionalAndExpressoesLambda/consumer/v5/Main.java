package ProgramacaoFuncionalAndExpressoesLambda.consumer.v5;

/*
 * Expressão lambda inline
 */

import ProgramacaoFuncionalAndExpressoesLambda.consumer.v5.entities.Product;

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

        double factor = 1.1;

        productList.forEach(product -> product.setProductPrice(product.getProductPrice() * factor));

        productList.forEach(System.out::println);

    }
}
