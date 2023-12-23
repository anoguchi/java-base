package GenericsSetAndMap.curingasDelimitadorOrBoundedWildcards.getPut;

/*
 * Fazer um método que copia os elementos de uma lista para uma outra lista que pode ser mais genérica que a primeira.
 * List<Integer> myInts = Array.asList(1, 2, 3, 4);
 * List<Double> myDoubles = Array.asList(3.14, 6.26);
 * List<Object> myObjs = new ArrayList<Object>();
 *
 * copy(myInts, myObjs);
 * copy(myDoubles, myObjs);
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.26);
        List<Object> myObjs = new ArrayList<>();

        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }
    public static void copy(List<? extends  Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }
    }
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
