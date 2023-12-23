package GenericsSetAndMap.curingasDelimitadorOrBoundedWildcards.getPut.covariancia;

/*
 * Princípio get/put - covariância
 * get - OK
 * put - ERROR
 *
 * Princípio get/put - contravariância
 * get - ERROR
 * put - OK
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;
        Number x = list.get(0);

        System.out.println(x);
        // list.add(20);

    }
}
