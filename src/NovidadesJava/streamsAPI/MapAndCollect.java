package NovidadesJava.streamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndCollect {
    public static void main(String[] args) {

        List<String> listaString = Arrays.asList("1", "2", "3");
        System.out.println(listaString);


        List<Integer> minhaListaInteira = listaString.stream()
                // Visa retornar um stream com o resultado de uma operacao que foi realizada com esse stream
                .map(Integer::valueOf)
                // Para coletar o resultado das transformacoes feitas em um fluxo
                .collect(Collectors.toList());

        System.out.println(minhaListaInteira);




    }
}
