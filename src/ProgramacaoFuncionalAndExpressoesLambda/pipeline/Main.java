package ProgramacaoFuncionalAndExpressoesLambda.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> stream = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(stream.toArray()));

        int sum = list.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        List<Integer> list1 = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).collect(Collectors.toList());
        List<Integer> list2 = list.stream().filter(x -> x % 2 == 0).map(x -> x * 20).toList();
        System.out.println(Arrays.toString(list1.toArray()));
        System.out.println(Arrays.toString(list2.toArray()));

    }
}
