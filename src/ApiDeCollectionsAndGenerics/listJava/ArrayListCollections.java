package ApiDeCollectionsAndGenerics.listJava;

import java.util.ArrayList;

public class ArrayListCollections {
    public static void main(String[] args) {

        /*
        Nos fornece arrays dinamicos em Java
        Pode ser mais lento que os arrays padrao
        Aumenta 50% quando estiver cheio
        Quando aumenta o tamanho, faz copia do array atual para um novo array com o mesmo tamanho
        */

        ArrayList<Integer> meuArrayList = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            meuArrayList.add(i);
            System.out.println(i);
        }

        // remove de um indice
        meuArrayList.remove(1);
        System.out.println(meuArrayList);

        // acessando um indice especifico
        System.out.println(meuArrayList.get(3));

        // retorna se esta vazio
        System.out.println(meuArrayList.isEmpty());

        // valida se encontra algum numero especifico
        System.out.println(meuArrayList.contains(10));

        // fazer copia do array
        System.out.println(meuArrayList.clone());

        // procurando onde esta na posicao/indice
        System.out.println(meuArrayList.indexOf(3));

        // limpar o array
        meuArrayList.clear();
    }
}
