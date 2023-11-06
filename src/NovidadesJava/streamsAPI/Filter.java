package NovidadesJava.streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        // filter -> usamos para retornar elementos que passam em um filtro indicado
        List<String> curso = Arrays.asList("Java", "Linux", "Tips", "Spring");
        List<String> terminaComS = curso.stream().filter(s -> s.endsWith("s")).collect(Collectors.toList());
        System.out.println(terminaComS);

    }
}
