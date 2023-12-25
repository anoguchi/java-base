package GenericsSetAndMap.Map.v1;

/*
 * É uma coleção de pares chave/valor
 * - Não admite repetições do objeto chave
 * - Os elementos são indexados pelo objeto chave (não possuem posição)
 * - Acesso, inserção e remoção de elementos são rápidos.
 *
 * Uso comum: cookies, local storage, qualquer modelo chave-valor.
 * Principais implementações:
 * - HashMap
 * - TreeMap
 * - LinkedHashMap
 *
 * Alguns métodos importantes
 * - put(key, value), remove(key), containsKey(key), get(key)
 *   Baseado em equals e hashCode
 *   Se equals e hashCode não existir, é usada comparação de ponteiros
 * - clear()
 * - size()
 *
 * - keySet() - retorna um Set<K>
 * - values() - retorna um Collection<V>
 */

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99999999");

        cookies.remove("email");
        cookies.put("phone", "1234456");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());


        System.out.println("ALL COOKIES");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }


    }
}
