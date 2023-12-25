package ProgramacaoFuncionalAndExpressoesLambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/*
 * É uma sequencia de elementos advinda de uma fonte de dados que oferece suporte a "operações agregadas".
 * - Fonte de dados: coleção, array, função de iteração, recurso de E/S
 *
 * Características
 *
 * - Stream é uma solução para processar sequências de dados de forma:
 *   - Declarativa (iteração interna: escondida do programador)
 *   - Parallel-friendly (imutável -> thread safe)
 *   - Sem efeitos colaterais
 *   - Sob demanda (lazy evaluation)
 *
 * - Acesso sequencia (não há índices)
 * - Singles-use: só pode ser "usada" uma vez
 * - Pipeline: operações em streams retornam novas streams. Então é possível criar uma cadeia de operaçÕes
 * (fluxo de processamento).
 *
 * Operações intermediárias e terminais
 *
 * - O pipeline é composto por zero ou mais operações intermediárias e uma terminal.
 * - Operação intermediária:
 *   - Produz uma nova streams (encadeamento)
 *   - Só executa quando uma operação terminal é invocada (lazy evaluation)
 * - Operação terminal:
 *   - Produz um objeto não-stream (coleção ou outro)
 *   - Determina o fim do processamento da stream
 *
 * Operações intermediárias
 * - filter, map, flatmap, peek, distinct, sorted, skip, limit(*short-circuit)
 * Operações terminais
 * - forEach, forEachOrdered, toArray, reduce, collect, min, max, count, anyMatch(*short-circuit),
 * allMatch(*short-circuit), noneMatch(*short-circuit), findFirst(*short-circuit), findAny(*short-circuit)
 *
 * Criar uma stream
 * - Basta chamar o método stream() ou parallelStream() a partir de qualquer objecto Collection.
 * - Outras formas de se criar uma stream incluem:
 *   - Stream.of
 *   - Stream.ofNullable
 *   - Stream.iterate
 *
 */
public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> stream = integerList.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(stream.toArray()));

        Stream<String> stream1 = Stream.of("Maria", "Alex", "Beto");
        System.out.println(Arrays.toString(stream1.toArray()));

        Stream<Integer> stream2 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(stream2.limit(10).toArray()));

        Stream<Long> stream3 = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] { p[1], p[0] + p[1]})
                .map(p -> p[0]);
        System.out.println(Arrays.toString(stream3.limit(10).toArray()));
    }
}
