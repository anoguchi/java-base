package Listas;

/*
 * Não podemos instanciar pois é uma interface. Vantagens: tamanho varíavel e facilidade para se realizar
 * inserções e deleções.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Julia");
        list.add("Alberto");
        list.add("Beto");
        list.add("Ce");
        list.add("Ca");
        list.add("André");
        list.add("Xand");
        list.add("Xuxa");
        list.add(2, "Ju");

        System.out.println("Tamanho da lista: " + list.size());

        list.remove("Ca");
        list.remove(2);
        list.removeIf(x -> x.charAt(0) == 'C');

        for (String x :
                list) {
            System.out.println(x);
        }

        System.out.println("Index of Julia: " + list.indexOf("Julia"));
        System.out.println("Index of Silva: " + list.indexOf("Silva"));

        List<String> resultInitiatesWithA = list.stream().filter(x -> x.charAt(0) == 'A').toList();
        for (String x : resultInitiatesWithA
        ) {
            System.out.println(x);
        }

        resultInitiatesWithA.forEach(System.out::println);
        String name = list.stream().filter(x -> x.charAt(0) == 'X').findFirst().orElse(null);
        System.out.println(name);


    }

}
