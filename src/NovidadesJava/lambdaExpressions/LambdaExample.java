package NovidadesJava.lambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {

    public static void main(String[] args) {

        /*
         * Pequeno bloco de codigo que recebe parametros e retorna um valor,
         * sao semelhantes a metodos. Nao precisam de um nome e podem estar dentro do corpo de outro metodo.
         */

        List<String> curso = Arrays.asList("Java", "Linux", "Tips", "Spring");
        List<String> java = curso.stream().filter(s -> s.equals("Java")).collect(Collectors.toList());
        System.out.println(java);
    }

}
