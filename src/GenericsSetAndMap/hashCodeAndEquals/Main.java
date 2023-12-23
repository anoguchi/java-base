package GenericsSetAndMap.hashCodeAndEquals;

import GenericsSetAndMap.hashCodeAndEquals.entities.Client;

/*
 * São operações da classe Object utilizadas para comparar se um objeto é igual a outro.
 * - equal: lento, resposta 100%, método que compara se o objeto é igual a outro, retornando true ou false.
 * - hashCode: rápido, porém resposta positiva não é 100%, método que retorna um número inteiro representando
 * um código gerado a partir das informações do objeto. Se o hashcode de dois objetos for diferente, então os dois
 * objetos são diferentes. Se o código de dois objetos for igual, muito provavelmente os objetos são iguais (pode haver
 * colisão).
 *
 * Tipos comuns (String, Date, Integer, Double, etc.) já possuem implementação para essas operações. Classes
 * personalizadas precisam sobrepô-las.
 */
public class Main {
    public static void main(String[] args) {

        Client client = new Client("Julia", "julia@gmail.com");
        Client client1 = new Client("Julia", "julia@gmail.com");

        String string1 = "Beto";
        String string2 = "Beto";

        System.out.println(client.hashCode());
        System.out.println(client1.hashCode());
        System.out.println(client.equals(client1));
        System.out.println(client == client1);
        System.out.println(string1 == string2);

    }
}
