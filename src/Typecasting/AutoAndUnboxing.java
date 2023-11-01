package Typecasting;

public class AutoAndUnboxing {
    public static void main(String[] args) {

        // autoboxing é a conversão de um valor primitivo em um objeto wrapper correspondente.
        int valorInt = 10;
        Integer integer = valorInt;
        System.out.println(integer);

        // unboxing converte do wrapper para o primitivo
        Integer wrapperInteger = 13;
        int primitivoInteger = wrapperInteger;
        System.out.println(primitivoInteger);

    }
}
