package Arrays;

import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {

        // estrutura de dados simples para armazenar uma coleção de elementos

        // forma mais comum
        int[] arrayDeInt;

        // forma menos comum
        int arrayDeInt02[];

        // inicializando um array com um tamanho definido
        int[] arrayDeInt03 = new int[20];

        Integer[] arrayDeInt04 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // percorrendo o array
        List<Integer> itens = Arrays.asList(arrayDeInt04);
        itens.forEach(System.out::println);

        // fazendo cópias
        String[] treinamento = new String[]{"Treinamento", "descomplicando", "Java", "e", "Spring", "da", "Linuxtips"};
        String[] treinamentoNome = Arrays.copyOfRange(treinamento, 1, 5);
        List<String> treinamentoNomeList = List.of(treinamentoNome);
        treinamentoNomeList.forEach(System.out::println);

        // fazendo cópias escolhendo o tamanho
        String[] arraycom2 = Arrays.copyOf(treinamentoNome, 4);
        List<String> arrayCom2List = List.of(arraycom2);
        arrayCom2List.forEach(System.out::println);

    }
}
