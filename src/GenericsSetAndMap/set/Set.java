package GenericsSetAndMap.set;

/*
 * Set<T>
 * Representa um conjunto de elementos (similar ao da Álgebra)
 * - Não admite repetições
 * - Elementos não possuem posição
 * - Acesso, inserção e remoção de elementos são rápidos
 * - Oferece operações eficientes de conjunto: interseção, união, diferença.
 * - Principais implementações:
 *   - HashSet: mais rápido (operações O(1) em tabela hash) e não ordenado.
 *   - TreeSet: mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo compareTO do objeto (ou
 *     Comparador).
 *   - LinkedHashSet: velocidade intermediária e elementos na ordem em que são adicionados.
 * Alguns métodos importantes
 * - add(obj), remove(obj), contains(obj)
 *   - Baseado em equals e hashCode
 *   - Se equals e hashCode não existir, é usada comparação de ponteiros
 * - clear()
 * - size()
 * - removeIf(predicate)
 *
 * - addAll(other): união, adiciona no conjunto os elementos do outro conjunto, sem repetição.
 * - retainAll(other) - interseção, remove do conjunto os elementos não contidos em other.
 * - removeAll(other) - diferença, remove do conjunto os elementos contidos em other.
 *
 */

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        // Set<String> set = new LinkedHashSet<>();
        // Set<String> set = new TreeSet<>();
        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");
        set.add("Ipad");
        set.add("Iphone");
        set.add("Monitor");
        set.add("Mouse");
        set.add("Keyboard");
        set.add("Pencil");
        set.add("Car");

        System.out.println(set.contains("Notebook"));
        set.remove("Car");
        set.removeIf(x -> x.length() <= 3);
        set.removeIf(x -> x.charAt(0) == 'I');

        for (String string : set) {
            System.out.println(string);
        }

    }
}
