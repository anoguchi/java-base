package NovidadesJava.streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedAndForEach {

    public static void main(String[] args) {

        List<String> unsortedList = Arrays.asList("9", "2", "3", "Java", "Spring", "Linux", "Tips");

        // sorted -> ordena os itens
        List<String> sortedList = unsortedList.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedList);

        // for-each -> iterar sobre os elementos do stream
        sortedList.forEach(System.out::println);

    }

}
