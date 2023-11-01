package ApiDeCollectionsAndGenerics.Generic;

public class GenericMain {
    public static void main(String[] args) {

        GenericExample<Integer> mensagemInteira = new GenericExample<>(1000);
        mensagemInteira.escrever();

        GenericExample<Double> mensagemDecimal = new GenericExample<>(12343.56);
        mensagemDecimal.escrever();

        GenericExample<String> mensagemString = new GenericExample<>("Alberto");
        mensagemString.escrever();

    }
}
