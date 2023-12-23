package GenericsSetAndMap.curingasDelimitadorOrBoundedWildcards.getPut.contravariancia;

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

        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add(20);

        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);
        System.out.println(myNums);

        // Number x = myNums.get(0);

    }
}
