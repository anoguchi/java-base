package Arrays.boxingUnboxingAndWrapper;

/*
 * Wrapper
 * Integer é forma de tratar tipos primitivos como classes, com isso você não precisa de preocupar em fazer
 * conversões ou casting.
 * Uso comum: campos de entidades em sistemas de informação, pois tipos referência (classes) aceitam valor null
 * e usufruem dos recursos OOP
 */

public class Main {

    public static void main(String[] args) {

        int x = 20;
        Object object = x;

        System.out.println(object);

        int y = (int) object;
        System.out.println(y);

        int a = 10;
        Integer object02 = a;
        int b = object02 + 2;
        System.out.println(a);
        System.out.println(b);
    }
}
