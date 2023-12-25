package ProgramacaoFuncionalAndExpressoesLambda.consumer.v5.util;

import ProgramacaoFuncionalAndExpressoesLambda.consumer.v5.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        product.setProductPrice(product.getProductPrice() * 1.1);
    }
}
