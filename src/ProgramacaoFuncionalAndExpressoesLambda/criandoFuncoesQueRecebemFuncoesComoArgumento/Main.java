package ProgramacaoFuncionalAndExpressoesLambda.criandoFuncoesQueRecebemFuncoesComoArgumento;

/*
 * Recordando
 * - removeIf(Predicate)
 * - forEach(Consumer)
 * - map(Function)
 *
 * Fazer um programa que, a partir de uma lista de produtos, calcule a soma dos preços somente dos produtos
 * cujo nome começa com "T".
 *
 */

import ProgramacaoFuncionalAndExpressoesLambda.criandoFuncoesQueRecebemFuncoesComoArgumento.entities.Product;
import ProgramacaoFuncionalAndExpressoesLambda.criandoFuncoesQueRecebemFuncoesComoArgumento.services.ProductService;

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
        productList.add(new Product("HD Case", 80.00));

        ProductService productService = new ProductService();

        double sum = productService.filteredSum(productList, product -> product.getName().charAt(0) == 'M');
        System.out.println("Sum = " + String.format("%.2f", sum));

    }
}
