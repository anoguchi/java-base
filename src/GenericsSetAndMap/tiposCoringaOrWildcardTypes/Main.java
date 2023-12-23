package GenericsSetAndMap.tiposCoringaOrWildcardTypes;

/*
 * Generics são invariantes
 *
 * List<Object> não é o supertipo da qualquer tipo de lista:
 * List<Object> myObjs = new ArrayList<Object>();
 * List<Integer> myNumbers = new Arraylist<Integer>();
 * myObjs = myNumbers; // erro de compilação
 *
 * O supertipo de qualquer tipo de lista é List<?>. Este é um tipo curinga:
 * List<?> myObjs = new ArrayList<Object>();
 * List<Integer> myNumbers = new ArrayList<Integer>();
 * myObjs = myNumbers // compilado com sucesso
 *
 * Integer é um Object mas lista de Integer não é uma list de Object.
 * Com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo". Porém não é possível adicionar
 * dados a uma coleção de tipo curinga.
 */

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Julia", "Bobo");
        printList(myStrs);

    }
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
