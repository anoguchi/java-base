package Typecasting;

public class Widening {

    public static void main(String[] args) {

        /*
         * Esse tipo de typecasting ocorre quando a conversão é feita de forma automática.
         */

        int variavelInt = 123;
        long variavelLong = variavelInt;

        System.out.println(variavelInt);
        System.out.println(variavelLong);

        // Ao estar indo para um espaço maior, não é perdido nenhuma informação
        // byte -> short -> int -> long -> float -> double
        float variavelFloat = variavelLong;
        double variavelDouble = variavelLong;

        System.out.println(variavelFloat);
        System.out.println(variavelDouble);

    }

}
