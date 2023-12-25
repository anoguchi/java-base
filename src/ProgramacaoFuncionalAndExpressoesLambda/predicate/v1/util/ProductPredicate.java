package ProgramacaoFuncionalAndExpressoesLambda.predicate.v1.util;

import ProgramacaoFuncionalAndExpressoesLambda.predicate.v1.entities.Product;
import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {
    @Override
    public boolean test(Product product) {
        return product.getProductPrice() >= 100.00;
    }
}
